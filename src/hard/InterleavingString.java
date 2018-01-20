package hard;

/**
 * Created by stengali on 1/20/18.
 */
public class InterleavingString {

    public boolean interLeaving(String a, String b, String c) {
        boolean [][]dp = new boolean[a.length()+1][b.length()+1];

        if(a.length() + b.length() != c.length())
            return false;

        for(int i=0;i<=a.length();i++) {
            for(int j=0;j<=b.length();j++) {
                int l = i + j - 1;
                if(i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if(i==0) {
                    if(c.charAt(l) == b.charAt(j-1)) {
                        dp[i][j] = dp[i][j-1];
                    }
                } else if(j==0) {
                    if(c.charAt(l) == a.charAt(i-1)) {
                        dp[i][j] = dp[i-1][j];
                    }
                } else {
                    dp[i][j] = (a.charAt(i-1) == c.charAt(l) ? dp[i-1][j] : false) || (b.charAt(j-1) == c.charAt(l) ? dp[i][j-1] : false);
                }
            }
        }
        return dp[a.length()][b.length()];
    }
    public static void main(String[] args) {
        InterleavingString obj = new InterleavingString();
        System.out.println(obj.interLeaving("xxym", "xxzt", "xxxzxytm"));
    }
}
