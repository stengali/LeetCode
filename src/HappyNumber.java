/**
 * Created by stengali on 11/4/17.
 */
public class HappyNumber {

    int digitSquareSum(int n) {
        int sum = 0, tmp;
        while (n > 0) {
            tmp = n % 10;
            sum += tmp * tmp;
            n /= 10;
        }
        return sum;
    }

    boolean isHappy(int n) {
        int slow, fast;
        slow = fast = n;
        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(fast);
            fast = digitSquareSum(fast);
        } while(slow != fast);
        if (slow == 1) return true;
        return false;
    }
    public static void main(String[] args) {
    HappyNumber hN = new HappyNumber();
        System.out.println(hN.isHappy(21));
    }
}
