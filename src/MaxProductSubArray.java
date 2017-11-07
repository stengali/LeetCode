/**
 * Created by stengali on 10/25/17.
 */
public class MaxProductSubArray {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,0,4,-5};
        int max = nums[0];
        int min = nums[0];
        int res = nums[0];

        for (int i=1;i<nums.length;i++) {
            if(nums[i] < 0)
            {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i],max*nums[i]);
            min = Math.min(nums[i],min*nums[i]);
            res = Math.max(res,max);
        }
        System.out.println(res);
    }
}
