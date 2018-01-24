package easy;

/**
 * Created by stengali on 1/23/18.
 */
public class CountPrimes {

public static int getPrimeNumberCount(int n) {
    boolean[] notPrime = new boolean[n];
    int count = 0;
        for (int i = 2; i < n; i++) {
        if (notPrime[i] == false) {
            count++;
            for (int j = 2; i*j < n; j++) {
                notPrime[i*j] = true;
            }
        }
    }

        return count;
}
    public static void main(String[] args) {
        CountPrimes obj = new CountPrimes();
        System.out.println();
    }
}
