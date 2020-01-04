package LeetCode.Oct20_2019;

import JZOffer.TreeNode;

import java.util.Arrays;

/**
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：

 二叉树的根是数组中的最大元素。
 左子树是通过数组中最大值左边部分构造出的最大二叉树。
 右子树是通过数组中最大值右边部分构造出的最大二叉树。
 通过给定的数组构建最大二叉树，并且输出这个树的根节点。

  

 示例 ：

 输入：[3,2,1,6,0,5]
 输出：返回下面这棵树的根节点：

 6
 /   \
 3     5
 \    /
 2  0
 \
 1
  

 提示：

 给定的数组的大小在 [1, 1000] 之间。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/maximum-binary-tree
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by Amie on 2019/10/20.
 */
public class ConstructMaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        int maxPos = maxPos(nums);
        if (maxPos == -1)
            return null;
        TreeNode root = new TreeNode(nums[maxPos]);

        int leftnums[] = Arrays.copyOfRange(nums, 0, maxPos);
        int rightnums[] = Arrays.copyOfRange(nums, maxPos+1, nums.length);
        root.left = constructMaximumBinaryTree(leftnums);
        root.right = constructMaximumBinaryTree(rightnums);
        return root;
    }

    public int maxPos(int [] nums){
        if (nums.length == 0)
            return -1;
        int pos = -1;
        int max = nums[0];
        for (int i=0;i<nums.length;i++){
            if (max <= nums[i]){
                pos = i;
                max = nums[i];
            }
        }
        return pos;
    }

}
