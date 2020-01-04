package JZOffer;

/**
 * Created by Amie on 2018/7/25.
 */
public class LeftRota {
    public String LeftRota(String str, int n){
        if (n ==0 || str.length()==0)
            return str;
        n = n%str.length();
        char[] strs = str.toCharArray();
        reverse(strs, n, str.length()-1);
        reverse(strs, 0, n-1);
        reverse(strs, 0, str.length()-1);
        return String.valueOf(strs);
    }
    public char[] reverse(char[] strs, int start, int end){
        while (start < end){
            char temp = strs[start];
            strs[start] = strs[end];
            strs[end] = temp;
            start++;
            end--;
        }
        return strs;
    }

    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(new LeftRota().LeftRota(str, 1));
    }
}
