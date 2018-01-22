package easy;

/**
 * Created by stengali on 1/21/18.
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int x = 0;
        for(int i:nums)
            x = x ^ i;
        return x;
    }
    public static void main(String[] args) {
        SingleNumber obj = new SingleNumber();
        System.out.println();
    }
}
