package LeetCode.Nov_28;

import java.util.Arrays;

/**
 * @Author: Amiedon
 * @Date: 2019/11/28 10:55
 */
public class LengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0 ) return 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0;i<nums.length;i++){
            for (int j=0;j<i;j++){
                if (nums[i] > nums[j])
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLIS().lengthOfLIS(new int[]{0}));
    }
}
