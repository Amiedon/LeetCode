package JZOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Amie on 2018/7/25.
 */
public class PrintTreeInZ {
    public ArrayList<ArrayList<Integer>> printTree(TreeNode root){
        if (root == null)
            return new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        Stack<TreeNode> oddStack = new Stack<>();
        Stack<TreeNode> evenStack = new Stack<>();
        boolean isOdd = true;
        oddStack.push(root);
        while (!oddStack.isEmpty() || !evenStack.isEmpty()){
            if (isOdd){
                ArrayList<Integer> line = new ArrayList<>();
                while (!oddStack.isEmpty()){
                    TreeNode node = oddStack.pop();
                    line.add(node.value);
                    if (node.left!=null)
                        evenStack.push(node.left);
                    if (node.right!=null)
                        evenStack.push(node.right);
                }
                isOdd = false;
                result.add(line);
            }
            else {
                ArrayList<Integer> line = new ArrayList<>();
                while (!evenStack.isEmpty()){
                    TreeNode node = evenStack.pop();
                    line.add(node.value);
                    if (node.right!=null)
                        oddStack.push(node.right);
                    if (node.left!=null)
                        oddStack.push(node.left);
                }
                isOdd=true;
                result.add(line);
            }
        }
        return result;
    }
}
