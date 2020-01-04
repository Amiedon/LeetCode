package LeetCode.Dec_03;

/**
 * @Author: Amiedon
 * @Date: 2019/12/3 16:26
 */
public class CountNumbersWithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        int result = 1;
        for (int i=1;i<=n;i++){
            result += (i-1) * A(9, i-1) + A(9, i);
        }
        return result;
    }

    public int A(int base, int i){
        int result = 1;
        for (int k = base;k>base - i;k--)
            result *= k;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CountNumbersWithUniqueDigits().A(4, 1));
        System.out.println(new CountNumbersWithUniqueDigits().countNumbersWithUniqueDigits(2));
    }
}
