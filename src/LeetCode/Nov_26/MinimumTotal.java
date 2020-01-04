package LeetCode.Nov_26;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Amiedon
 * @Date: 2019/11/26 21:33
 */
public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int level = triangle.size();//层数
        if (level == 0) return 0;
        int[][] dp = new int[level][triangle.get(level-1).size()];
        dp[0][0] = triangle.get(0).get(0);
        for (int i=1;i<level;i++){
            for (int k=0;k<=i;k++){
                if (k == 0) dp[i][k] = dp[i-1][k] + triangle.get(i).get(k);
                else if (k == i) dp[i][k] = dp[i-1][k-1] + triangle.get(i).get(k);
                else dp[i][k] = Math.min(dp[i-1][k], dp[i-1][k-1]) + triangle.get(i).get(k);
            }
        }
        int min = Integer.MAX_VALUE;
        for (int k=0;k<triangle.get(level-1).size();k++){
            if (dp[level-1][k] < min)
                min = dp[level-1][k];
        }
        return min;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 3, 8));
        System.out.println(new MinimumTotal().minimumTotal(triangle));
    }
}
