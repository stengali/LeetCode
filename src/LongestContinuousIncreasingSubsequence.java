/**
 * Created by stengali on 10/4/17.
 *
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence.
 */
public class LongestContinuousIncreasingSubsequence {
    //with temp
    public static int findLengthOfLCIS(int[] nums) {
        int maxOverall = 1;
        int count = 1;
        if(nums.length <= 0){
            return 0;
        }
        int temp = nums[0];
        for(int i=1;i<nums.length;i++){
            if(temp < nums[i]){
                count++;
                temp = nums[i];
            }
            else{
                maxOverall = Math.max(count,maxOverall);
                temp = nums[i];
                count = 1;
            }
        }
        return Math.max(count,maxOverall);
    }

    //Without temp
    public int findLengthOfLCIS1(int[] nums) {
        int res = 0, cnt = 0;
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i-1] < nums[i]) res = Math.max(res, ++cnt);
            else cnt = 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,3,5,4,2,3,4,5};
        System.out.println(findLengthOfLCIS(a));
    }
}
