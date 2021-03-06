package LeetCode.Nov_26;

/**
 * 2 * @Author: Amiedon
 * 3 * @Date: 2019/11/26 21:16
 * 4给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 *
 * 说明：每次只能向下或者向右移动一步。
 *
 * 示例:
 *
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * dp[i][j] = min( dp[i-1][j])
 */
public class MinPathSum {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int [][] dp = new int[m][n];
        for (int i=0;i<m;i++){
            for (int k = 0;k<=i;k++){
                dp[i][0] += grid[k][0];
            }
        }
        for (int j=0;j<n;j++){
            for (int k = 0;k<=j;k++){
                dp[0][j] += grid[0][k];
            }
        }
        dp[0][0] = grid[0][0];

        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(new MinPathSum().minPathSum(new int[][]{ {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}}));
    }
}
