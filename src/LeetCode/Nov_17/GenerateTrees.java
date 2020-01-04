package LeetCode.Nov_17;

import LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树。
 *
 * 示例:
 *
 * 输入: 3
 * 输出:
 * [
 *   [1,null,3,2],
 *   [3,2,null,1],
 *   [3,1,null,null,2],
 *   [2,1,3],
 *   [1,null,2,null,3]
 * ]
 * 解释:
 * 以上的输出对应以下 5 种不同结构的二叉搜索树：
 *
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-binary-search-trees-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 每次递归，都很容易绕晕，感觉是自己的逻辑还不够清晰。
 *
 * 写下这道题的思考路程：
 *
 * 先不考虑回归条件，考虑递归逻辑(感觉递归逻辑最难理清楚)。
 *
 *  考虑左子树：
 *  自己刚刚开始想到要让k位左边的数字去生成左子树。那么怎么生成？不考虑细节，应该是让左边的1...k-1数字去生成所有的二叉搜索树数组，那么这个数组里的所有二叉搜索树都可以作为以k为根节点的二叉树的左子树。
 *
 *  考虑右子树：
 *  右子树的生成逻辑和左子树一样。让右边k+1...n的数字去生成所有的二叉搜索树数组，那么这个数组里的所有二叉搜索树都可以作为以k为根节点的二叉树的右子树。
 * 这样的话，递归逻辑代码应该是：
 *
 *   leftTrees = self.p_genrateTrees(1,k-1) #生成所有左子树
 *   rightTrees = self.p_gerateTrees(k+1,n) #生成所有右子树
 *   all_trees = []
 *   for left in leftTrees:
 *       for right in rightTrees:
 *           rootNode = TreeNode(k) #生成根节点
 *           rootNode.left,rootNode.right = left,right #赋值左右子树
 *           all_trees.append(rootNode)
 * 😂感觉要理清递归逻辑，就要先假设自己的函数能够返回正确的东西，不敢
 *
 * 作者：雨天多久就
 * 链接：https://www.jianshu.com/p/35accf0da4cd
 * 来源：简书
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class GenerateTrees {
    public List<TreeNode> generateTrees(int n){
        if (n == 0)
            return new ArrayList<>();
        if (n == 1) {
            List<TreeNode> treeNodeList = new ArrayList<>();
            treeNodeList.add(new TreeNode(1));
            return treeNodeList;
        }
        return createTreeList(1, n);
    }

    private List<TreeNode> createTreeList(int start, int end) {
        List<TreeNode> treeNodeArrayList = new ArrayList<>();
        if (start > end){
            treeNodeArrayList.add(null);
            return treeNodeArrayList;
        }
        for (int i=start;i<end +1;i++){
            List<TreeNode> left = createTreeList(start, i-1);
            List<TreeNode> right = createTreeList(i+1, end);
            for (int j=0;j<left.size();j++){
                for (int k=0;k<right.size();k++){
                    TreeNode treeNode = new TreeNode(i);
                    treeNode.left = left.get(j);
                    treeNode.right = right.get(k);
                    treeNodeArrayList.add(treeNode);
                }
            }
        }
        return treeNodeArrayList;
    }

    public static void main(String[] args) {
        List<TreeNode> list= new GenerateTrees().generateTrees(3);
        System.out.println();
    }
}
