package easy;

/**
 * Created by stengali on 1/21/18.
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        for (int i=1;i<nums.length;i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);
        }
        return maxSoFar;
    }
    public static void main(String[] args) {
        MaximumSubarray obj = new MaximumSubarray();
        System.out.println();
    }
}
