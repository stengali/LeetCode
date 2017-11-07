/**
 * Created by stengali on 10/18/17.
 */
public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target) {
        if(nums == null || nums.length <1)
            return -1;
        int l = 0;
        int h = nums.length - 1;

        while(l<h) {
            int mid = (l + h)/2;
            if(nums[mid] > nums[h])
                l = mid + 1;
            else
                h = mid;
        }
        int pivot = l;
        if (pivot > 0 && target >= nums[0] && target <= nums[pivot - 1]) {
            l = 0;
            h = pivot -1;
        } else {
            l = pivot;
            h = nums.length -1;
        }

        while(l<=h) {
            int mid = (l+h)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[mid] < target)
                l =  mid +1;
            else
                h = mid-1;
        }
        return -1;
    }
    public static void hello(int a){
        System.out.println("here");
    }
    public static void hello(long a){
        System.out.println("here12easd");
    }

    public static void main(String[] args) {
        hello(1);
        System.out.println(search(new int[]{4,5,6,7,8,1,2,3},2));
    }
}
