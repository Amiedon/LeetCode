package LeetCode.Nov_17;

import LeetCode.TreeNode;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树和一个目标和，找到所有从根节点到叶子节点路径总和等于给定目标和的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \    / \
 *         7    2  5   1
 * 返回:
 *
 * [
 *    [5,4,11,2],
 *    [5,8,4,5]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        if (root == null)
            return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            temp.add(treeNode.val);
            if (treeNode.left == null && treeNode.right == null && ListSum(temp) == sum){
                result.add(new ArrayList<>(temp));
            }
            if (treeNode.right!=null){
                stack.push(treeNode.right);
            }
            if (treeNode.left!=null){
                stack.push(treeNode.left);
            }
            temp.remove(temp.size()-1);
        }
        return result;
    }
    public int ListSum(@NotNull List<Integer> list){
        int sum = 0;
        for (int i=0;i<list.size();i++){
            sum += list.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.right = new TreeNode(8);
        System.out.println(new PathSum().pathSum(root, 20));
    }
}
