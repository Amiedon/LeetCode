package LeetCode.Nov_27;

/**
 * @Author: Amiedon
 * @Date: 2019/11/27 14:53
 * #213 problem
 */
public class Rob_213 {
    public int rob(int[] nums){
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        return Math.max(robsub(nums, 0, nums.length-2), robsub(nums, 1, nums.length-1));
    }

    public int robsub(int[] nums, int start, int end){
        int n = end - start + 1;
        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start+1]);
        for (int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-2] + nums[i+start], dp[i-1]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        System.out.println(new Rob_213().rob(new int[]{1, 2, 1, 1}));
    }
}
