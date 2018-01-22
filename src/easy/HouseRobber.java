package easy;

/**
 * Created by stengali on 1/21/18.
 */
public class HouseRobber {

    public int rob(int[] nums) {
        int prevNo = 0;
        int prevYes = 0;
        for (int n : nums) {
            int temp = prevNo;
            prevNo = Math.max(prevNo, prevYes);
            prevYes = n + temp;
        }
        return Math.max(prevNo, prevYes);
    }
    public static void main(String[] args) {
        HouseRobber obj = new HouseRobber();
        System.out.println(obj.rob(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
