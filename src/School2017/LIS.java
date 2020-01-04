package School2017;

import java.util.Scanner;

/**
 * Created by Amie on 2018/9/1.
 */
public class LIS {
    public static void main(String[] args) {
        int [] nums = {5, 3, 4, 8, 6, 7, 0, 0, 1, 2, 4, 7};
        int [] dp = new int[nums.length];
        dp[0] = 1;
        for (int i=1;i<nums.length;i++){
            if (nums[i] >= nums[i-1])
                dp[i] = dp[i-1]+1;
            else
                dp[i] = dp[i-1];
        }
        System.out.println(dp[nums.length-1]);
    }
}
