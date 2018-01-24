package easy;

/**
 * Created by stengali on 1/23/18.
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        int x = 0;
        for(int i=0;i<=nums.length;i++) {
            x = x^ i;
        }
        for(int i:nums) {
            x = x^i;
        }

        return x;
    }
    public static void main(String[] args) {
        MissingNumber obj = new MissingNumber();
        System.out.println();
    }
}
