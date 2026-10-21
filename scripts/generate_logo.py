"""Rasterize Craftium's original block-grid mark. Requires Pillow; no image API."""
from pathlib import Path
from PIL import Image, ImageDraw

ROOT = Path(__file__).resolve().parents[1]
INK = "#5b9fdb"  # Editor accent
POINTS = [(10, 6), (26, 6), (26, 12), (14, 12), (14, 20),
          (26, 20), (26, 26), (10, 26), (6, 22), (6, 10)]


def raster(size: int, destination: Path) -> None:
    # Pixel-center sampling keeps straight edges on the same grid at every size.
    scale = size * 4 / 32
    image = Image.new("RGBA", (size * 4, size * 4))
    ImageDraw.Draw(image).polygon([(x * scale, y * scale) for x, y in POINTS], fill=INK)
    image = image.resize((size, size), Image.Resampling.LANCZOS)
    alpha = image.getchannel("A")
    image = Image.new("RGBA", (size, size), INK)
    image.putalpha(alpha)
    destination.parent.mkdir(parents=True, exist_ok=True)
    image.save(destination, optimize=True)


def main() -> None:
    branding = ROOT / "branding"
    branding.mkdir(exist_ok=True)
    path = "M " + " L ".join(f"{x} {y}" for x, y in POINTS) + " Z"
    (branding / "craftium.svg").write_text(
        '<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 32 32" '
        'width="512" height="512" role="img" aria-labelledby="title">\n'
        '  <title id="title">Craftium</title>\n'
        f'  <path fill="{INK}" d="{path}"/>\n</svg>\n', encoding="utf-8")
    raster(512, branding / "craftium.png")
    raster(128, ROOT / "src/main/resources/assets/craftium/icon.png")


if __name__ == "__main__":
    main()
