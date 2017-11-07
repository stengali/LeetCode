import java.util.*;

/**
 * Created by stengali on 10/12/17.
 */
public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length-1;j++){
                Set<Integer> list = new HashSet<>();
                list.add(nums[i]);
                list.add(nums[j]);
                map.put(nums[i]+nums[j],list);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int key:map.keySet()){
            int sub = target > key ? target - key : key - target;
            if(map.containsKey(sub) && map.get(key)!=map.get(sub)){
                Set<Integer> s1 = new HashSet<>();
                s1.addAll(map.get(key));
                s1.addAll(map.get(sub));
                if(s1.size() == 4)
                {
                    List<Integer> r1 = new ArrayList<>();
                    r1.addAll(map.get(key));
                    r1.addAll(map.get(sub));
                    Collections.sort(r1);
                    res.add(r1);
                }
            }
        }
        System.out.println(res.toString());
        return res;
    }


    public static void main(String[] args) {
        fourSum(new int[]{2, 7, 4, 0, 9, 5, 1, 3},20);
    }
}
