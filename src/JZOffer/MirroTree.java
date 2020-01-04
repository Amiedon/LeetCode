package JZOffer;

/**
 * Created by Amie on 2018/7/18.
 */
public class MirroTree {
    public static void mirro(TreeNode root){
        if (root == null)
            return ;
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if (root.left!=null)
            mirro(root.left);
        if (root.right!=null)
            mirro(root.right);
    }
    public static void printTr(TreeNode root){
        if (root!=null){
            printTr(root.left);
            printTr(root.right);
            System.out.println(root.value);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(2);
        printTr(root);
        MirroTree.mirro(root);
        printTr(root);
    }
}
