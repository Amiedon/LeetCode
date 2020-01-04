package LeetCode.Dec_03;

/**
 * @Author: Amiedon
 * @Date: 2019/12/3 13:31
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        int count = 0;
        while (n!=0){
            count++;
            n &= (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new HammingWeight().hammingWeight(2));
    }
}
