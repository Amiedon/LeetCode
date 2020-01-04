package JZOffer;

import java.util.Scanner;

/**
 * Created by Amie on 2018/7/16.
 */
public class Solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] num = new int[n];
        for(int i=0;i<num.length;i++){
            num[i] = scanner.nextInt();
        }
        for (int i=0;i<num.length;i++){
            if (num[i] == i){
                continue;
            }
            else {
                int m = num[i];
                if(m == num[m]){
                    System.out.println("Find");
                    System.out.println(m);
                }
                else {
                    int temp = num[i];
                    num[i] = num[m];
                    num[m] = temp;
                }
            }
        }
    }

    private static void swap(int m, int i) {
        int temp = m;
        m = i;
        i = temp;
    }
}
