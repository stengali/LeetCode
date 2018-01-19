package hard;

/**
 * Created by stengali on 1/18/18.
 */
public class LongestIncreasingPath {

    public int lip(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp = new int[n][m];
        int max = 0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                int length = dfs(i, j, matrix, dp, Integer.MAX_VALUE);
                max = Math.max(max, length);
            }
        }
        return max;
    }
    public int dfs(int i, int j, int[][] matrix, int[][] dp, int val) {

        if(i<0 || i>=matrix.length || j<0 || j>=matrix[0].length || matrix[i][j] >= val)
            return 0;

        if(dp[i][j] > 0)
            return dp[i][j];
        else {
            int cur = matrix[i][j];
            int temp = 0;
            temp = Math.max(temp, dfs(i-1,j,matrix,dp,cur));
            temp = Math.max(temp, dfs(i+1,j,matrix,dp,cur));
            temp = Math.max(temp, dfs(i,j-1,matrix,dp,cur));
            temp = Math.max(temp, dfs(i,j+1,matrix,dp,cur));
            dp[i][j] = ++temp;
            return temp;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{9,9,4},{6,6,8},{2,1,1}};
        LongestIncreasingPath obj = new LongestIncreasingPath();
        System.out.println(obj.lip(matrix));
    }
}
