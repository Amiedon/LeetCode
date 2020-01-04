package JZOffer;

/**
 * Created by Amie on 2018/7/25.
 */
public class TreeDepth {
    public int getTreeDepth(TreeNode root){
        if (root == null)
            return 0;
        int left = getTreeDepth(root.left);
        int right = getTreeDepth(root.right);
        if (left > right)
            return left+1;
        else
            return right+1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        System.out.println(new TreeDepth().getTreeDepth(root));
    }
}
