package JZOffer;

/**
 * Created by Amie on 2018/7/25.
 */
public class FindKthNode {
    public static int index = 0;
    public TreeNode KthNode(TreeNode root, int K){
        if (root!=null){
            TreeNode node = KthNode(root.left, K);
            if (node!=null)
                return node;
            index++;
            if (index == K){
                return root;
            }
            node = KthNode(root.right, K);
            if (node!=null)
                return node;
        }
        return null;
    }
}
