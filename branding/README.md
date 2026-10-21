# Craftium mark

One angular C, drawn on a 32-unit block grid. The two clipped outer corners echo a cut block; the open center stays legible at small sizes. The single color, `#5b9fdb`, is the editor's existing blue accent. The background is transparent.

`craftium.svg` is the editable vector. `craftium.png` is a 512-pixel export. `python scripts/generate_logo.py` regenerates both and the 128-pixel mod icon from the same geometry (requires Pillow).

The editor header and builder HUD load that same mod icon. Both the Fabric and Paper/Purpur JARs include the PNG and SVG. Paper's built-in plugin list displays text and has no icon field.
