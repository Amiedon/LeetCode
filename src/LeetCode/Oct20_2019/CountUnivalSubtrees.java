package LeetCode.Oct20_2019;

/**
 * 给定一个二叉树，统计该二叉树数值相同的子树个数。

 同值子树是指该子树的所有节点都拥有相同的数值。

 示例：

 输入: root = [5,1,5,5,5,null,5]

 5
 / \
 1   5
 / \   \
 5   5   5

 输出: 4

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/count-univalue-subtrees
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by Amie on 2019/10/20.
 */
public class CountUnivalSubtrees {
    private int count = 0;
    public int countUnivalSubtrees(TreeNode root) {//BFS 检查
        countNode(root);
        return count;
    }
    public boolean countNode(TreeNode node){
        if (node== null)
            return true;
        boolean left = countNode(node.left);
        boolean right = countNode(node.right);
        boolean cur = true;
        TreeNode leftNode = node.left;
        TreeNode rightNode = node.right;
        if (leftNode!=null && leftNode.val!=node.val)
            cur = false;
        if (rightNode!=null && rightNode.val!=node.val)
            cur = false;
        cur = cur && left && right;
        if (cur)
            count++;
        return cur;
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }

    public static void main(String[] args) {

    }
}
