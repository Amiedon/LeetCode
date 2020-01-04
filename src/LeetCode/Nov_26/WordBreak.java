package LeetCode.Nov_26;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: Amiedon
 * @Date: 2019/11/26 22:41
 * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
 *
 * 说明：
 *
 * 拆分时可以重复使用字典中的单词。
 * 你可以假设字典中没有重复的单词。
 * 示例 1：
 *
 * 输入: s = "leetcode", wordDict = ["leet", "code"]
 * 输出: true
 * 解释: 返回 true 因为 "leetcode" 可以被拆分成 "leet code"。
 * 示例 2：
 *
 * 输入: s = "applepenapple", wordDict = ["apple", "pen"]
 * 输出: true
 * 解释: 返回 true 因为 "applepenapple" 可以被拆分成 "apple pen apple"。
 *      注意你可以重复使用字典中的单词。
 * 示例 3：
 *
 * 输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * 输出: false
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/word-break
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 现在，我们考虑 \text{dp}dp 数组求解的过程。我们使用 n+1n+1 大小数组的 \text{dp}dp ，其中 nn 是给定字符串的长度。我们也使用 2 个下标指针 ii 和 jj ，其中 ii 是当前字符串从头开始的子字符串（s's
 * ′
 *  ）的长度， jj 是当前子字符串（s's
 * ′
 *  ）的拆分位置，拆分成 s'(0,j)s
 * ′
 *  (0,j) 和 s'(j+1,i)s
 * ′
 *  (j+1,i) 。
 *
 * 为了求出 \text{dp}dp 数组，我们初始化 \text{dp}[0]dp[0] 为 \text{true}true ，这是因为空字符串总是字典的一部分。 \text{dp}dp 数组剩余的元素都初始化为 \text{false}false 。
 *
 * 我们用下标 ii 来考虑所有从当前字符串开始的可能的子字符串。对于每一个子字符串，我们通过下标 jj 将它拆分成 s1's1
 * ′
 *   和 s2's2
 * ′
 *   （注意 ii 现在指向 s2's2
 * ′
 *   的结尾）。为了将 \text{dp}[i]dp[i] 数组求出来，我们依次检查每个 \text{dp}[j]dp[j] 是否为 \text{true}true ，也就是子字符串 s1's1
 * ′
 *   是否满足题目要求。如果满足，我们接下来检查 s2's2
 * ′
 *   是否在字典中。如果包含，我们接下来检查 s2's2
 * ′
 *   是否在字典中，如果两个字符串都满足要求，我们让 \text{dp}[i]dp[i] 为 \text{true}true ，否则令其为 \text{false}false 。
 *
 * 作者：LeetCode
 * 链接：https://leetcode-cn.com/problems/word-break/solution/dan-ci-chai-fen-by-leetcode/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for (int i=1;i<=s.length();i++){
            for (int j=0;j<i;j++){
                if (dp[j] && wordDict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        System.out.println(new WordBreak().wordBreak("leetcode", Arrays.asList("leet", "code")));
    }
}
