package LeetCode;

/**
 * Created by Amie on 2019/9/16.
 */
public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        String result = "";
        int length = 2 * s.length();
        boolean [][] f = new boolean[2 * s.length()][2 * s.length()];
        int start = length + s.length() / 2;
        for (int i = start; i >= length; i--){
            for (int j=i;j<length; j++){
                if ((s.charAt(i) == s.charAt(j) ) && ((j - i) <=1 || f[i+1][j-1])){
                    f[i][j] = true;
                }
            }
        }
        return result;
    }
}
