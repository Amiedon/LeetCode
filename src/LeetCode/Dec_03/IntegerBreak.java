package LeetCode.Dec_03;

/**
 * @Author: Amiedon
 * @Date: 2019/12/3 13:39
 */
public class IntegerBreak {
    public int integerBreak(int n) {
        if (n == 2)
            return 1;
        else if (n == 3)
            return 2;
        int[] dp = new int[n + 1];
        dp[2] = 2;
        dp[3] = 3;
        for (int i = 4; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] * 2, dp[i - 3] * 3);
        }
        return dp[n];
    }

    public int integerBreak2(int n){
        if (n == 1) return 1;
        int[] dp = new int[n+1];
        dp[2] = 1;
        for (int i=2;i<=n;i++){
            for (int j = 0;j<i;j++){
                dp[i] = Math.max(dp[i], Math.max((i-j) * dp[j], j * (i - j)));// j * (i - j) 表示j不分割，整数分为j，i-j
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new IntegerBreak().integerBreak(10));
        System.out.println(new IntegerBreak().integerBreak2(10));
    }
}
