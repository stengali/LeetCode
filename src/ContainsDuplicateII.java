import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by stengali on 10/3/17.
 *
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 */
public class ContainsDuplicateII {
    //Using Map
    public boolean containsNearbyDuplicate1(int[] nums, int k) {
        Map<Integer, Integer> indices = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer lastIndex = indices.put(nums[i], i);
            if (lastIndex != null && (i - lastIndex) <= k)
                return true;
        }
        return false;
    }

    //SlidingWindow
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i > k){
                set.remove(nums[i - k - 1]);
            }
            if(!set.add(nums[i])) return true;
        }
        return false;
    }
}
