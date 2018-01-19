package hard;

import java.util.Arrays;

/**
 * Created by stengali on 1/19/18.
 */
public class NextHighestPalindrome {

    public Long findHigherPalindrome(Long limit) {
        String n = Long.toString(limit);
        char[] s = n.toCharArray(); // limit
        int m = s.length;
        char[] t = Arrays.copyOf(s, m); // target
        for (int i = 0; i < m / 2; i++) {
            t[m - 1 - i] = t[i];
        }
        for (int i = 0; i < m; i++) {
            if (s[i] < t[i]) {
                return Long.parseLong(String.valueOf(t));
            } else if (s[i] > t[i]) {
                for (int j = (m - 1) / 2; j >= 0; j--) {
                    if (++t[j] > '9') {
                        t[j] = '0';
                    } else {
                        break;
                    }
                }
                // make it palindrome again
                for (int k = 0; k < m / 2; k++) {
                    t[m - 1 - k] = t[k];
                }
                return Long.parseLong(String.valueOf(t));
            }
        }
        return Long.parseLong(String.valueOf(t));
    }

    public static void main(String[] args) {
        NextHighestPalindrome obj = new NextHighestPalindrome();
        System.out.println(obj.findHigherPalindrome(1343l));
    }
}
