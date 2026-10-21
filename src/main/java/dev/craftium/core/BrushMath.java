package dev.craftium.core;

import java.util.ArrayList;
import java.util.List;

public final class BrushMath {
    private BrushMath() {}
    public enum Shape { SPHERE, CUBE, OCTAHEDRON, CYLINDER }

    public static boolean contains(Shape shape, int x, int y, int z, int radius) {
        return switch (shape) {
            case SPHERE -> x * x + y * y + z * z <= radius * radius;
            case CUBE -> Math.max(Math.max(Math.abs(x), Math.abs(y)), Math.abs(z)) <= radius;
            case OCTAHEDRON -> Math.abs(x) + Math.abs(y) + Math.abs(z) <= radius;
            case CYLINDER -> x * x + z * z <= radius * radius && Math.abs(y) <= radius;
        };
    }

    public static List<Point> brush(Point center, int radius, Shape shape, boolean hollow) {
        if (radius < 1 || radius > 24) throw new IllegalArgumentException("Radius must be 1–24");
        var points = new ArrayList<Point>();
        for (int x = -radius; x <= radius; x++) for (int y = -radius; y <= radius; y++)
            for (int z = -radius; z <= radius; z++) {
                if (contains(shape, x, y, z, radius) && (!hollow ||
                    !contains(shape, x, y, z, radius - 1))) points.add(center.add(x, y, z));
            }
        return points;
    }

    public static List<Point> line(Point a, Point b) {
        int steps = Math.max(Math.max(Math.abs(b.x()-a.x()), Math.abs(b.y()-a.y())), Math.abs(b.z()-a.z()));
        if (steps > 512) throw new IllegalArgumentException("Line exceeds 512 blocks");
        var points = new ArrayList<Point>();
        if (steps == 0) return List.of(a);
        for (int i = 0; i <= steps; i++) {
            double t = (double)i / steps;
            points.add(new Point((int)Math.round(a.x() + (b.x()-a.x()) * t),
                (int)Math.round(a.y() + (b.y()-a.y()) * t), (int)Math.round(a.z() + (b.z()-a.z()) * t)));
        }
        return points;
    }

    /** Stable coherent value noise, independent of stroke order. */
    public static double noise(double x, double y, double z, long seed) {
        int ix = (int)Math.floor(x), iy = (int)Math.floor(y), iz = (int)Math.floor(z);
        double tx = smooth(x-ix), ty = smooth(y-iy), tz = smooth(z-iz);
        return lerp(lerp(lerp(hash(ix,iy,iz,seed),hash(ix+1,iy,iz,seed),tx),
                         lerp(hash(ix,iy+1,iz,seed),hash(ix+1,iy+1,iz,seed),tx),ty),
                    lerp(lerp(hash(ix,iy,iz+1,seed),hash(ix+1,iy,iz+1,seed),tx),
                         lerp(hash(ix,iy+1,iz+1,seed),hash(ix+1,iy+1,iz+1,seed),tx),ty),tz);
    }

    public static double hash(int x, int y, int z, long seed) {
        long h = seed ^ x * 0x9E3779B97F4A7C15L ^ y * 0xC2B2AE3D27D4EB4FL ^ z * 0x165667B19E3779F9L;
        h = (h ^ (h >>> 30)) * 0xBF58476D1CE4E5B9L;
        h = (h ^ (h >>> 27)) * 0x94D049BB133111EBL;
        return ((h ^ (h >>> 31)) >>> 11) * 0x1.0p-53;
    }
    private static double smooth(double t) { return t*t*(3-2*t); }
    private static double lerp(double a, double b, double t) { return a+(b-a)*t; }
}
