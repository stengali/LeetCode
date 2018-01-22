package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by stengali on 1/21/18.
 */
public class DuplicateNumber {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i:nums) {
            if(!set.add(i))
                return true;
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {

        Arrays.sort(nums);
        for(int ind = 1; ind < nums.length; ind++) {
            if(nums[ind] == nums[ind - 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DuplicateNumber obj = new DuplicateNumber();
        System.out.println();
    }
}
