package dev.craftium.server;

import dev.craftium.core.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LuaBrushTest {
    @Test void evaluatesCoordinatesAndBlockNames(){var script=new LuaBrush(null,"if y == 20 then return \"minecraft:emerald_block\" end");assertEquals("minecraft:emerald_block",script.evaluate(new Point(1,20,3)).tojstring());assertTrue(script.evaluate(new Point(1,21,3)).isnil());}
    @Test void doesNotExposeHostLibraries(){var script=new LuaBrush(null,"return io == nil and os == nil and luajava == nil and package == nil and loadfile == nil and debug == nil");assertTrue(script.evaluate(new Point(0,0,0)).toboolean());}
    @Test void cancelsInfiniteLoops(){var script=new LuaBrush(null,"while true do end");assertThrows(IllegalArgumentException.class,()->script.evaluate(new Point(0,0,0)));}
}
