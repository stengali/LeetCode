import java.util.HashMap;
import java.util.Map;

/**
 * Created by stengali on 10/18/17.
 */
public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int sum = 0;
        int result = 0;
        HashMap<Integer,Integer> preSum = new HashMap<>();
        preSum.put(0,1);

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            int temp = preSum.containsKey(sum) ? sum : 0;
            preSum.put(sum,1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,3,4,6,7,8},10));
    }

}
