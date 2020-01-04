package LeetCode.Dec_03;

/**
 * @Author: Amiedon
 * @Date: 2019/12/3 10:22
 *
 * f[i] = {1+ min(f[i-coin])}
 * f(n)=min{f(n-1),f(n-5),f(n-11)}+1
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 * 示例 1:
 *
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 * 示例 2:
 *
 * 输入: coins = [2], amount = 3
 * 输出: -1
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        //自底向上
        int [] dp = new int[amount + 1];

        for (int i=1;i<=amount;i++){
            int cost = Integer.MAX_VALUE;
            for (int j = 0;j<coins.length;j++){
                if (i - coins[j] >=0 && dp[i - coins[j]] != Integer.MAX_VALUE){
                    cost = Math.min(cost, dp[i-coins[j]] + 1);
                }
            }
            dp[i] = cost;
        }
        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        System.out.println(new CoinChange().coinChange(new int[]{1, 2, 5}, 11));
    }
}
