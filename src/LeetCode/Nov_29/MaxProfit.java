package LeetCode.Nov_29;

/**
 * @Author: Amiedon
 * @Date: 2019/11/29 15:01
 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
 *
 * 注意你不能在买入股票前卖出股票。
 *
 * 示例 1:
 *
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 * 示例 2:
 *
 * 输入: [7,6,4,3,1]
 * 输出: 0
 * 解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 */
public class MaxProfit {
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
    private void draft(){
        int i = 1, k = 2;
        int[] prices = new int[100];
        int[][][] dp = new int[100][100][100];
        dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
        dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i]);//消费一次
        k = 1;
    }
    public static void main(String[] args) {
        System.out.println(new MaxProfit().maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(1.5 + 59 + 162 + 1.5 + 1.5 + 7.9 + 1.5 + 1.5  + 90 + 1.5 + 1.5 + 1.5 + 2
                + 2+ 100 + 30 + 1.5 + 142 + 1.5 + 1.5 + 2.29 + 1.5 + 1449 + 20 + 1 + 28 + 111 + 20
                + 100 + 120 + 1096 + 11 + 13+ 30 + 1 + 9.0 + 18 + 1.5 + 5.5 + 9.9 + 5.5 + 12 + 89 + 20
                + 30 + 94 + 192 + 8 + 130 + 11.9 + 127 + 25 + 10 + 58 + 7.5 );
    }
}
