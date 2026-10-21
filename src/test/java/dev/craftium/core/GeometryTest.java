package dev.craftium.core;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class GeometryTest {
    @Test void brushesAreSymmetricAndHollowShellsExcludeTheInterior() {
        for (var shape : BrushMath.Shape.values()) {
            var solid = new HashSet<>(BrushMath.brush(new Point(0,0,0),5,shape,false));
            var shell = new HashSet<>(BrushMath.brush(new Point(0,0,0),5,shape,true));
            assertTrue(solid.containsAll(shell)); assertFalse(shell.contains(new Point(0,0,0)));
            solid.forEach(p -> assertTrue(solid.contains(new Point(-p.x(),-p.y(),-p.z()))));
        }
    }
    @Test void selectionBooleanOperationsAreAtomicAtTheLimit() {
        var s = new Selection();
        var a = new Point(0,0,0); var b = new Point(1,0,0); var c = new Point(2,0,0);
        s.combine(List.of(a,b),Selection.Mode.REPLACE);
        s.combine(List.of(b,c),Selection.Mode.ADD); assertEquals(3,s.size());
        s.combine(List.of(b,c),Selection.Mode.INTERSECT); assertEquals(Set.of(b,c),s.points());
        s.combine(List.of(b),Selection.Mode.SUBTRACT); assertEquals(Set.of(c),s.points());
        var huge = new ArrayList<Point>(); for(int i=0;i<=Selection.LIMIT;i++) huge.add(new Point(i,0,0));
        assertThrows(IllegalArgumentException.class,()->s.combine(huge,Selection.Mode.REPLACE));
        assertEquals(Set.of(c),s.points());
    }
    @Test void boxRejectsOverflowAndIncludesBothCorners() {
        assertEquals(27, Selection.box(new Point(2,2,2),new Point(0,0,0)).size());
        assertThrows(IllegalArgumentException.class,()->Selection.box(new Point(Integer.MIN_VALUE,0,0),new Point(Integer.MAX_VALUE,0,0)));
    }
    @Test void lineHasNoGapsAndIncludesBothEndpoints() {
        Point a=new Point(-4,2,8),b=new Point(11,-7,0);
        var line=BrushMath.line(a,b); assertEquals(a,line.getFirst());assertEquals(b,line.getLast());
        for(int i=1;i<line.size();i++) assertTrue(line.get(i).distanceSquared(line.get(i-1))<=3);
        assertEquals(List.of(a),BrushMath.line(a,a));
    }
    @Test void transformsRoundTrip() {
        Point p=new Point(4,-8,17);
        assertEquals(p,p.rotateY().rotateY().rotateY().rotateY());assertEquals(p,p.mirrorX().mirrorX());
    }
    @Test void noiseIsStableContinuousAndBounded() {
        for(int i=-30;i<30;i++) {
            double a=BrushMath.noise(i*.13,3.25,-1.2,42);
            assertTrue(a>=0 && a<=1);assertEquals(a,BrushMath.noise(i*.13,3.25,-1.2,42));
            assertTrue(Math.abs(a-BrushMath.noise(i*.13+.001,3.25,-1.2,42))<.01);
        }
        assertNotEquals(BrushMath.noise(.3,.4,.5,42),BrushMath.noise(.3,.4,.5,43));
    }
}
