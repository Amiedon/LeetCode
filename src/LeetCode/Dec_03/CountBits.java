package LeetCode.Dec_03;

/**
 * @Author: Amiedon
 * @Date: 2019/12/3 11:00
 */
public class CountBits {
    public int[] countBits(int num) {
        int[] ans = new int[num + 1];
        for (int i = 0;i<=num;i++){
            ans[i] = getBitCount(i);
        }
        return ans;
    }
    public int getBitCount(int n){
        int count = 0;
        while ( n !=0){
            count ++;
            n &= (n-1);
        }
        return count;
    }

    public static void main(String[] args) {
        for (int ans : new CountBits().countBits(5)){
            System.out.println(ans);
        }
    }
}
