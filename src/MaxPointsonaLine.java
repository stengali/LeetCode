import java.util.*;

/**
 * Created by stengali on 10/24/17.
 */
public class MaxPointsonaLine {
    public static int maxPoints(Point[] points) {
        if(points.length < 1)
            return 0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int slope;
        for (Point p:points) {
            if(p.x == 0)
                slope = p.y;
            else
                slope = p.y / p.x;
            if(map.containsKey(slope))
                map.put(slope,map.get(slope)+1);
            else
                map.put(slope,1);
        }
        List<Integer> mapValues = new ArrayList<>(map.values());
        Collections.sort(mapValues);
        return mapValues.get(mapValues.size()-1);
    }
    public static void main(String[] args) {
        Point a = new Point(0,0);
        Point b = new Point(0,1);
        Point[] points = new Point[]{a,b};
        maxPoints(points);


    }
}


class Point {
     int x;
      int y;
      Point() { x = 0; y = 0; }
      Point(int a, int b) { x = a; y = b; }
  }