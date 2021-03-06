package LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？找出所有满足条件且不重复的三元组。

 注意：答案中不可以包含重复的三元组
 标签：数组遍历
 首先对数组进行排序，排序后固定一个数nums[i]，再使用左右指针指向nums[i]后面的两端，数字分别为nums[L]和nums[R]，计算三个数的和sum判断是否满足为0，满足则添加进结果集
 如果nums[i]大于0，则三数之和必然无法等于0，结束循环
 如果nums[i] == nums[i-1]，则说明该数字重复，会导致结果重复，所以应该跳过
 当sum == 0时，nums[L] == nums[L+1]则会导致结果重复，应该跳过，L++
 当sum == 0时，nums[R] == nums[R-1]则会导致结果重复，应该跳过，R--
 时间复杂度：O(n^2)，n为数组长度
 # 代码
 * Created by Amie on 2019/8/31.
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int [] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if (nums == null || nums.length<3)
            return result;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>0) break;
            if (i>0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if ( sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left+1]) left++;
                    while (left < right && nums[right] == nums[right-1]) right--;
                    left++;
                    right--;
                }
                else if (sum >0)
                    right--;
                else left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, 4}));
    }
}
