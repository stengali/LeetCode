package hard;

import java.util.*;

/**
 * Created by stengali on 1/21/18.
 */
public class InsertDeleteGetRandom {

    List<Integer> nums;
    Map<Integer, Set<Integer>> map;
    Random rand;

    InsertDeleteGetRandom() {
        nums = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    public boolean insert(int val) {
        boolean contain = map.containsKey(val);
        if(!contain){
            map.put(val, new LinkedHashSet<>());
        }
        map.get(val).add(nums.size());
        nums.add(val);
        return !contain;
    }

    public boolean remove(int val) {
        boolean contain = map.containsKey(val);
        if(!contain)
            return false;
        int item = map.get(val).iterator().next();
        map.get(val).remove(item);
        if(item < nums.size() - 1) {
            int lastOne = nums.get(nums.size() - 1);
            nums.set(item, lastOne);
            map.get(lastOne).remove(nums.size() - 1);
            map.get(lastOne).add(item);
        }
        nums.remove(nums.size() - 1);
        if (map.get(val).isEmpty())
            map.remove(val);
        return true;
    }

    public int getRandom() {
        return nums.get(rand.nextInt(nums.size()));
    }
    public static void main(String[] args) {
        InsertDeleteGetRandom obj = new InsertDeleteGetRandom();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(1);
        obj.insert(4);
        obj.insert(5);
        obj.remove(1);
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
        System.out.println(obj.getRandom());
    }
}
