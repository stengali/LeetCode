/**
 * Created by stengali on 10/26/17.
 */
public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        //System.out.println("abcdefg".substring(0,3));
        System.out.println(validPalindrome("NITINA"));

    }

    public static boolean validPalindrome(String s) {
        int l = -1, r = s.length();
        while (++l < --r)
            if (s.charAt(l) != s.charAt(r)) return isPalindromic(s, l, r+1) || isPalindromic(s, l-1, r);
        return true;
    }

    public static boolean isPalindromic(String s, int l, int r) {
        while (++l < --r)
            if (s.charAt(l) != s.charAt(r)) return false;
        return true;
    }
}
