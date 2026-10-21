package dev.craftium.core;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class SelectionCodecTest {
    @Test void preservesIrregularSelectionAcrossNegativeCoordinates(){
        var points=new LinkedHashSet<Point>();for(int x=-30;x<30;x++)for(int y=-20;y<20;y++)if((x+y)%3!=0)points.add(new Point(x,y,x*y));
        assertEquals(points,SelectionCodec.decode(SelectionCodec.encode(points)));
    }
    @Test void rejectsMalformedCompressedData(){assertThrows(IllegalArgumentException.class,()->SelectionCodec.decode("not gzip"));}
}
