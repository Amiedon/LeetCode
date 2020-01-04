package LeetCode.Nov_17;

import java.util.Stack;

/**
 * 给定一个整数数组，你需要验证它是否是一个二叉搜索树正确的先序遍历序列。
 *
 * 你可以假定该序列中的数都是不相同的。
 *
 * 参考以下这颗二叉搜索树：
 *
 *      5
 *     / \
 *    2   6
 *   / \
 *  1   3
 * 示例 1：
 *
 * 输入: [5,2,6,1,3]
 * 输出: false
 * 示例 2：
 *
 * 输入: [5,2,1,3,6]
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/verify-preorder-sequence-in-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 这个题需要理解如下知识点：
 *
 * 先序遍历，如果递减，一定是左子树；
 * 如果出现非递减的值，意味着到了某个节点的右子树；
 * 利用栈来寻找该节点，最后一个比当前元素小的从栈弹出的元素即为该节点的父亲节点，而且当前元素父节点即为新的下限值；
 * 后续的元素一定是比当前的下限值要大的，否则return false；
 */
public class VerifyPreorder {
    public boolean verifyPreorder(int[] preorder){
        int min = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<preorder.length;i++){
            if (preorder[i] < min){
                return false;
            }
            while (!stack.isEmpty() && preorder[i]>stack.peek())
                min = stack.pop();
            stack.push(preorder[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new VerifyPreorder().verifyPreorder(new int[]{5, 2, 1, 3, 6}));
    }
}
