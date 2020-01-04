package LeetCode.Nov_29;

/**
 * @Author: Amiedon
 * @Date: 2019/11/29 10:21
 */
public class NumMatrix {
    public int[][] dp;
    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        int m = matrix.length;
        int n = matrix[0].length;
        dp = new int[m][n];
        dp[0][0] = matrix[0][0];
        for (int i=1;i<m;i++){
            dp[i][0] = dp[i-1][0] + matrix[i][0];
        }
        for (int j=1;j<n;j++){
            dp[0][j] =  dp[0][j-1] + matrix[0][j];
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return dp[row2][ col2] + dp[row1][ col1] - dp[row2][col1] - dp[row1][col2];
    }

    public static void main(String[] args) {

    }
}
