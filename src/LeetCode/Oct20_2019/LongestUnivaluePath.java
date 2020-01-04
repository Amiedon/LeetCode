package LeetCode.Oct20_2019;

import LeetCode.TreeNode;

/**
 * Created by Amie on 2019/10/20.
 */
public class LongestUnivaluePath {
    int max = 0;
    public int longestUnivaluePath(TreeNode root) {
        if (root == null)
            return 0;
        bfs(root);
        return max;
    }

    public int bfs(TreeNode node){
        int left = 0;
        int right = 0;
        if (node.left!=null && node.left.val == node.val)
            left = 1 + bfs(node.left);
        else if (node.left != null)
            bfs(node.left);
        if (node.right != null && node.right.val == node.val)
            right = 1+ bfs(node.right);
        else if (node.right != null)
            bfs(node.right);
        if (left + right > max)
            max = left + right;
        return left>right? left:right;
    }
}
