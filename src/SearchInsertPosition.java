/**
 * Created by stengali on 10/3/17.
 *
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.
 */
public class SearchInsertPosition {
    //O(n)
    public int searchInsert1(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){
            if(nums[i] == target) return i;
            if(target < nums[i]) return i;
        }
        return nums.length;
    }
    //O(logn)
    public int searchInsert(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target){
                high = mid - 1;
            } else{
                low = mid + 1;
            }
        }
        return low;
    }

}
