package School2017;

import java.util.Scanner;

/**
 * Created by Amie on 2018/8/6.
 */
public class MergeColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] cols = new int[n];
        for (int i=0;i<n;i++){
            cols[i] = scanner.nextInt();
        }
        System.out.println(gethighbit(3));
        System.out.println(getColorcount(cols));
    }
    public static int gethighbit(int n){
        int count = 0;
        while (n>0){
            n>>=1;
            count++;
        }
        return count;
    }

    public static int getColorcount(int [] cols){
        int count = 0;
        for (int i=cols.length-1; i>=0;i--){
            for (int j=i-1;j>=0;j--){
                if (gethighbit(cols[i]) == gethighbit(cols[j])){
                    cols[j] = cols[j] ^ cols[i];
                }
            }
        }
        for (int i=0;i<cols.length;i++){
            if (cols[i]!=0)
                count++;
        }
        return count;
    }
}
