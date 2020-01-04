package LeetCode.Nov_29;

/**
 * @Author: Amiedon
 * @Date: 2019/11/29 15:49
 * 与上一题MaxProfit相比较，不限制次数，K看做无限大
 */
public class MaxProfit_2 {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];/// 第0天持有，总利润为-prices[0]
        for (int i=1;i<n;i++){
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }
        return dp[n-1][0];
    }
    private void draft(){
        int i = 1, k = 2;
        int[] prices = new int[100];
        int[][][] dp = new int[100][100][100];
        dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
        dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i]);//消费一次
        k = 1;
    }

    public static void main(String[] args) {
        System.out.println(new MaxProfit_2().maxProfit(new int[]{1,2,3,4,5}));
    }
}
