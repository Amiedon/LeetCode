package LeetCode.Nov_17;

import LeetCode.TreeNode;

import java.util.Stack;

public class DFS {
    public void BFS(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode treeNode = stack.pop();
            System.out.println(treeNode.val);
            if (treeNode.right!=null)
                stack.push(treeNode.right);
            if (treeNode.left!=null)
                stack.push(treeNode.left);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.right = new TreeNode(8);
        new DFS().BFS(root);
    }
}
