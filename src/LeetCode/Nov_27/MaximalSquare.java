package LeetCode.Nov_27;

/**
 * @Author: Amiedon
 * @Date: 2019/11/27 16:03
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix){
        if (matrix == null ) return 0;
        int[][] dp = new int[matrix.length][matrix[0].length];
        int max = 0;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (i ==0 || j==0) dp[i][j] = matrix[i][j] - '0';
                else if (matrix[i][j] == '1'){
                    dp[i][j] = Math.min(dp[i-1][j], Math.min(dp[i][j-1], dp[i-1][j-1])) + 1;
                }
                max = Math.max(max, dp[i][j]);
            }
        }
        return max * max;
    }

    public static void main(String[] args) {
        System.out.println(new MaximalSquare().maximalSquare(new char[][]{
                {'1','0','1','0','0'},
                {'1', '0', '1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}}));
        System.out.println(new MaximalSquare().maximalSquare(new char[][]{{'1'}}));
    }
}
