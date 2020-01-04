package JZOffer;

/**
 * Created by Amie on 2018/7/16.
 */
public class Solution7 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in){
        if (pre == null || in ==null)
            return null;
        return construct(pre, 0, pre.length-1, in, 0, in.length-1);
    }

    private TreeNode construct(int[] pre, int ps, int pe, int[] in, int is, int ie) {
        if (ps > pe){
            return null;
        }
        int value = pre[ps];
        int index = is;
        while (index < ie && in[index]!=value)
            index++;
        TreeNode treeNode = new TreeNode(value);
        treeNode.left = construct(pre, ps+1, ps+index-is, in, is, index-1);
        treeNode.right = construct(pre, ps+index-is+1, pe, in, index+1, ie  );
        return treeNode;
    }
}
