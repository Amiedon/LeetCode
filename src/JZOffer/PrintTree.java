package JZOffer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Amie on 2018/7/18.
 */
public class PrintTree {
    public static void PrintTreeTopB(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            System.out.println(temp.value);
            if (temp.left!=null)
                queue.offer(temp.left);
            if (temp.right!=null)
                queue.offer(temp.right);
        }
    }

    public static void PrintTree_First_order(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node!=null || !stack.isEmpty()){
            if (node!=null){
                System.out.println(node.value);
                stack.push(node);
                node = node.left;
            }
            else {
                node = stack.pop();
                node = node.right;
            }
        }
    }

    public static void PrintTree_In_Order(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node!=null || !stack.isEmpty()){
            if (node!=null){
                stack.push(node);
                node = node.left;
            }
            else {
                node = stack.pop();
                System.out.println(node.value);
                node = node.right;
            }
        }
    }

    public static TreeNode findKthNode(TreeNode root, int k){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        int index = 0;
        while (node!=null || !stack.isEmpty()){
            if (node!=null){
                stack.push(node);
                node = node.left;
            }
            else {
                node = stack.pop();
                index++;
                if (index == k)
                    return node;
                node = node.right;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        //PrintTreeTopB(root);
        //PrintTree_First_order(root);
        //PrintTree_In_Order(root);
        TreeNode node =  findKthNode(root, 3);
        if (node!=null)
            System.out.println(node.value);
    }
}
