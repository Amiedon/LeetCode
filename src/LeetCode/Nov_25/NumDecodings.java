package LeetCode.Nov_25;

/**
 * A message containing letters from A-Z is being encoded to numbers using the following mapping:
 *
 * 'A' -> 1
 * 'B' -> 2
 * ...
 * 'Z' -> 26
 * Given a non-empty string containing only digits, determine the total number of ways to decode it.
 *
 * Example 1:
 *
 * Input: "12"
 * Output: 2
 * Explanation: It could be decoded as "AB" (1 2) or "L" (12).
 * Example 2:
 *
 * Input: "226"
 * Output: 3
 * Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
 */
public class NumDecodings {
    public int numDecodings(String s) {
        if (s == null)
            return 0;
        if (s.length() == 1)
            return s.charAt(0) == '0'? 0:1;
        int[] dp = new int[s.length()];
        dp[0] = s.charAt(0) == '0'? 0:1;
        dp[1] = s.charAt(1) == '0'? 0:1;
        int twoValue = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
        if (twoValue < 10)
            dp[1] = 0;
        if (twoValue >=10 && twoValue <= 26)
            dp[1] += 1;
        for (int i=2;i<s.length();i++){
            if (s.charAt(i) != '0'){
                dp[i] = dp[i-1];
            }
            twoValue = (s.charAt(i-1) - '0') * 10 + (s.charAt(i) - '0');
            if (twoValue >=10 && twoValue <=26){
                if (s.charAt(i) == '0')
                    dp[i] = dp[i-2];
                else dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[s.length()-1];
    }

    public static void main(String[] args) {
        System.out.println(new NumDecodings().numDecodings("12"));
    }
}
