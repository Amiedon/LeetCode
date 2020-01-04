package LeetCode.Nov_29;

/**
 * @Author: Amiedon
 * @Date: 2019/11/29 16:08
 */
public class MaxProfit_4 {
    public int maxProfit(int m, int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        if (m > prices.length/2){
            return maxProfit(prices);
        }
        int[][][] dp = new int[prices.length][m +1][2];
        for (int i=0;i<prices.length;i++){
            for (int k = m; k>=1; k--){
                if (i - 1 == -1){
                    dp[i][k][0] = 0;
                    dp[i][k][1] = -prices[i];
                    continue;
                }
                dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i]);//消费一次
            }
        }
        return dp[prices.length-1][m][0];
    }
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

    public static void main(String[] args) {
        System.out.println(new MaxProfit_4().maxProfit(4, new int[]{1, 2, 4 ,2,5,7,2,4,9,0}));
    }
}
