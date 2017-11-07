package medium;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stengali on 11/6/17.
 */
public class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {

        if(nums == null || nums.length == 0)
            return new ArrayList();
        List<Integer> res = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            int temp = Math.abs(nums[i]) - 1;
            if(nums[temp] < 0)
                res.add(Math.abs(temp+1));
            nums[temp] = -nums[temp];
        }

        return res;
    }

    public static void main(String[] args) {
        FindAllDuplicatesInAnArray obj = new FindAllDuplicatesInAnArray();
        System.out.println(obj.findDuplicates(new int[]{1,2,5,5,2,4}).toString());
    }
}
