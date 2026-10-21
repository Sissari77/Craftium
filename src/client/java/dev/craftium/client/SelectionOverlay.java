package dev.craftium.client;

import dev.craftium.core.*;
import net.minecraft.world.phys.AABB;
import java.util.*;

final class SelectionOverlay {
    private static String encoded="";
    static List<AABB> boxes=List.of();
    private SelectionOverlay(){}
    static void update(String data){
        if(Objects.equals(encoded,data))return;encoded=data;boxes=merge(SelectionCodec.decode(data));
    }
    static List<AABB> merge(Collection<Point> points){
        var remaining=new HashSet<>(points);var ordered=new ArrayList<>(points);
        ordered.sort(Comparator.comparingInt(Point::y).thenComparingInt(Point::z).thenComparingInt(Point::x));var result=new ArrayList<AABB>();
        for(Point p:ordered){if(!remaining.contains(p))continue;int x=p.x(),z=p.z(),y=p.y();while(remaining.contains(new Point(x+1,p.y(),p.z())))x++;
            boolean extend=true;while(extend){for(int ix=p.x();ix<=x;ix++)if(!remaining.contains(new Point(ix,p.y(),z+1))){extend=false;break;}if(extend)z++;}
            extend=true;while(extend){for(int ix=p.x();ix<=x&&extend;ix++)for(int iz=p.z();iz<=z;iz++)if(!remaining.contains(new Point(ix,y+1,iz))){extend=false;break;}if(extend)y++;}
            for(int ix=p.x();ix<=x;ix++)for(int iy=p.y();iy<=y;iy++)for(int iz=p.z();iz<=z;iz++)remaining.remove(new Point(ix,iy,iz));
            result.add(new AABB(p.x(),p.y(),p.z(),x+1,y+1,z+1));
        }return List.copyOf(result);
    }
}
