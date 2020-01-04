package JZOffer;

/**
 * Created by Amie on 2018/7/18.
 */
public class HasSubtree {
    public static boolean HassubTree(TreeNode root1, TreeNode root2){
        boolean result = false;
        if (root1!=null && root2!=null){
            if (root1.value == root2.value)
                result =  doesHassubTree(root1, root2);
            if (!result)
                result = HassubTree(root1.left, root2);
            if (!result)
                result = HassubTree(root1.right, root2);
        }
        return result;
    }

    private static boolean doesHassubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null)
            return true;
        if (root1 == null)
            return false;
        if (root1.value != root2.value)
            return false;
        return doesHassubTree(root1.left, root2.left) && doesHassubTree(root1.right, root2.right);
    }
}
