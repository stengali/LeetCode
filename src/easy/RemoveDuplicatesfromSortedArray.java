package easy;

/**
 * Created by stengali on 1/21/18.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        int j=1;
        int temp = nums[0];
        for(int i=1;i<nums.length;i++) {
            if(nums[i-1] != nums[i]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray obj = new RemoveDuplicatesfromSortedArray();
        System.out.println();
    }
}
