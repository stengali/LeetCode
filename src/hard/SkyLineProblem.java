package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by stengali on 1/21/18.
 */

class BuildingPoint implements Comparable<BuildingPoint> {
    int x;
    int height;
    boolean isStart;

    @Override
    public int compareTo(BuildingPoint b) {
        if(this.x != b.x)
            return this.x - b.x;
        else {
            return (this.isStart ? -this.height : this.height) - (b.isStart ? -b.height : b.height);
        }
    }
}
public class SkyLineProblem {

    public List<int[]> getSkyline(int[][] buildings) {

        BuildingPoint[] buildingPoints = new BuildingPoint[buildings.length * 2];

        int index = 0;
        for (int []building : buildings) {
            buildingPoints[index] = new BuildingPoint();
            buildingPoints[index].x = building[0];
            buildingPoints[index].isStart = true;
            buildingPoints[index].height = building[2];

            buildingPoints[index + 1] = new BuildingPoint();
            buildingPoints[index + 1].x = building[1];
            buildingPoints[index + 1].isStart = false;
            buildingPoints[index + 1].height = building[2];
            index += 2;
        }
        Arrays.sort(buildingPoints);

        TreeMap<Integer, Integer> queue = new TreeMap<>();
        queue.put(0, 1);
        int prevMaxHeight = 0;
        List<int[]> result = new ArrayList<>();

        for (BuildingPoint buildingPoint : buildingPoints) {
            if(buildingPoint.isStart) {
                queue.put(buildingPoint.height, queue.getOrDefault(buildingPoint.height,0) + 1);
            } else {
                if(queue.containsKey(buildingPoint.height)) {
                    if(queue.get(buildingPoint.height) > 1) {
                        queue.put(buildingPoint.height, queue.get(buildingPoint.height) - 1);
                    } else {
                        queue.remove(buildingPoint.height);
                    }
                }
            }
            int currentMaxPoint = queue.lastKey();
            if(currentMaxPoint != prevMaxHeight) {
                result.add(new int[]{buildingPoint.x, currentMaxPoint});
                prevMaxHeight = currentMaxPoint;
            }
        }
        return result;
    }

        public static void main(String[] args) {
        SkyLineProblem obj = new SkyLineProblem();
        List<int []> res = obj.getSkyline(new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}});
        for (int []a : res)
            System.out.println(a[0] +" "+a[1]);
    }
}
