package LeetCode.Nov_25;

public class LongestPalindrome {
    public String longestPalindrome(String s){
        boolean[][] dp = new boolean[s.length()][s.length()];
        int left = 0, right = 0, len = 0;
        for (int i=0;i<s.length();i++){
            for (int j=0;j<i;j++){
                boolean b = s.charAt(i) == s.charAt(j);
                dp[j][i] = (b && (i - j < 2 || dp[j + 1][i - 1]));
                if (dp[j][i] && len < i - j + 1) {//把最大的回文子串长度存到len中
                    len = i - j + 1;
                    left = j;
                    right = i;
                }
            }
            dp[i][i] = true;
        }
        return s.substring(left, right+1);
    }

    public static void main(String[] args) {
        System.out.println(new LongestPalindrome().longestPalindrome("baacaaee"));
    }
}
