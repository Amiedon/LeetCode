package LeetCode.Nov_29;

/**
 * @Author: Amiedon
 * @Date: 2019/11/30 22:44
 */
public class MaxProfit_5 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];/// 第0天持有，总利润为-prices[0]
        for (int i=1;i<n;i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], - prices[i]);
        }
        return dp[n-1][0];
    }
}
