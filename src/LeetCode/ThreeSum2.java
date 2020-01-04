package LeetCode;

import java.util.Arrays;

/**给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/3sum-closest
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by Amie on 2019/8/31.
 */
public class ThreeSum2 {
    public static int threeSumClosest(int [] nums, int target){
        int abs = Integer.MAX_VALUE;
        int result=0;
        if (nums == null || nums.length <3) return -1;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length-1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target)<abs){
                    abs = Math.abs(sum - target);
                    result = sum;
                }
                if (sum > target)
                    right--;
                else if (sum < target)
                    left++;
                else
                    break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, -1, 1, 1, 3}, -1));
    }
}
