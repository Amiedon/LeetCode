package JZOffer;

import java.util.Scanner;

/**
 * Created by Amie on 2018/7/16.
 */
public class Solution3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] num = new int[n];
        for (int i=0;i<num.length;i++){
            num[i] = scanner.nextInt();
        }
        int[] Dup = new int[n];
        for (int i=0;i<Dup.length;i++){
            if (Dup[num[i]] == 0) {
                Dup[num[i]] = num[i];
            }
            else
                System.out.println(num[i]);
        }
    }
}
