package JZOffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Amie on 2018/7/25.
 */
public class PrintTreeInLine {
    public ArrayList<ArrayList<Integer>> printInline(TreeNode root){
        if (root == null)
            return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        ArrayList<Integer> line = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int nextlevel = 0;
        int toBeprint = 1;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            line.add(node.value);
            toBeprint--;
            if (node.left!=null){
                queue.offer(node.left);
                nextlevel++;
            }
            if (node.right!=null) {
                queue.offer(node.right);
                nextlevel++;
            }
            if (toBeprint == 0){
                result.add(line);
                toBeprint = nextlevel;
                line = new ArrayList<>();
                nextlevel = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(new PrintTreeInLine().printInline(root));
    }
}
