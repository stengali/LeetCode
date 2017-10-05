/**
 * Created by stengali on 10/4/17.
 */
public class ShortestUnsortedContinuousSubarray {

    //Doesn't pass all test cases. Needs modification
    public static  int findUnsortedSubarray(int[] nums) {
        int i = 0;
        int j = 0;
        int temp = 0;
        for(int a=0;a<nums.length;a++){
            if(temp > nums[a]){
                i = a - 1;
                break;
            }
            temp = nums[a];
        }

            temp = Integer.MAX_VALUE;
            for(int k=nums.length-1;k>=0;k--){
                if(temp < nums[k]){
                    j = k + 1;
                    break;
                }
                temp = nums[k];
            }
            if(j==0 && i==0)return 0;
            return j - i + 1;
        }

        //Works
        public static  int findUnsortedSubarray1(int[] nums) {
        int n = nums.length;
        int beg = -1;
        int end = -2;
        int min = nums[n - 1];
        int max = nums[0];
        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[n - 1 - i]);
            if (nums[i] < max) end = i;
            if (nums[n - 1 - i] > min) beg = n - 1 - i;
        }
        return end - beg + 1;
    }
    public static void main(String[] args) {
        int [] arr = new int[]{1,1,1,1,0,2,2,2};
        System.out.println(findUnsortedSubarray(arr));
    }
}