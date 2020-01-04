package LeetCode;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

 示例 1：

 输入: "babad"
 输出: "bab"
 注意: "aba" 也是一个有效答案。
 示例 2：

 输入: "cbbd"
 输出: "bb"

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/longest-palindromic-substring
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 method:
  动态规划+ 中心法
 * Created by Amie on 2019/9/16.
 */
public class LongestPalindrome {
    public String longestPalindrome(String s){
        boolean [][] f = new boolean[s.length()][s.length()];
        String result = "";
        for (int i=s.length()-1;i>=0;i--){
            for (int j=i;j<s.length();j++){
                if (s.charAt(i) == s.charAt(j) && ((j - i) <=1 || f[i+1][j-1])){
                    f[i][j] = true;
                    if (j - i >= result.length()){
                        result = s.substring(i, j+1);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindrome().longestPalindrome("baacaaee"));
    }
}
