package LeetCode;

/**给定一个字符串 s ，找出 至多 包含 k 个不同字符的最长子串 T。

 示例 1:

 输入: s = "eceba", k = 2
 输出: 3
 解释: 则 T 为 "ece"，所以长度为 3。
 示例 2:

 输入: s = "aa", k = 1
 输出: 2
 解释: 则 T 为 "aa"，所以长度为 2。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/longest-substring-with-at-most-k-distinct-characters
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by Amie on 2019/9/6.
 */
public class LengthOfLongestSubstringKDistinct {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int [] m = new int[256];//map数组
        int left = 0;
        int count = 0;
        int res = 0;
        for (int i=0;i<s.length();i++){
            if (m[s.charAt(i)] == 0) count++;
            m[s.charAt(i)]++;
            while (count > k){
                m[s.charAt(left)] -- ;
                if (m[s.charAt(left)] == 0) count -- ;
                left++;
            }
            res = Math.max(res, i-left+1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new LengthOfLongestSubstringKDistinct().lengthOfLongestSubstringKDistinct("eceba", 2));
    }
}
