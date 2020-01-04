package LeetCode.Nov_28;

import java.util.Arrays;

/**
 * @Author: Amiedon
 * @Date: 2019/11/28 9:39
 */
public class NumSquares {
    public int numSquares(int n) {
        if (n<=0) return 0;
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        for (int i=0;i*i<=n;i++) dp[i*i] = 1;
        for (int i=1;i<=n;i++){
            for (int j=1;i+j*j<=n;j++){
                dp[i+j*j] = Math.min(dp[i]+1, dp[i+j*j]);
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new NumSquares().numSquares(5));
    }
}
