package JZOffer;

/**
 * Created by Amie on 2018/7/25.
 */
public class BanlancedTree {
    public static boolean isBanlance = true;
    public boolean chekBanlance(TreeNode root){
        getBanlance(root);
        return isBanlance;
    }

    private int getBanlance(TreeNode root) {
        if (root == null)
            return 0;
        int left = getBanlance(root.left);
        int right = getBanlance(root.right);
        if (Math.abs(left-right)>1)
            isBanlance = false;
        if (left>right)
            return left+1;
        else
            return right+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(1);
    }
}
