package JZOffer;

import java.util.ArrayList;

/**
 * Created by Amie on 2018/7/18.
 */
public class FindPath {
    ArrayList<Integer> list = new ArrayList<>();
    private ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> findpath(TreeNode root, int target){
        if (root == null)
            return result;
        list.add(root.value);
        target-=root.value;
        if (target == 0 && root.left == null && root.right == null)
            result.add(new ArrayList<>(list));
        findpath(root.left, target);
        findpath(root.right, target);
        list.remove(list.size()-1);
        return result;
    }
}
