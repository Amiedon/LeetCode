package School2017;

import java.util.Scanner;

/**
 * Created by Amie on 2018/7/26.
 */
public class MaxStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n+1];
        for (int i=1;i<=n;i++){
            arr[i] = scanner.nextInt();
        }
        int K = scanner.nextInt();
        int D = scanner.nextInt();
        long res = Long.MIN_VALUE;
        long[][] fmax = new long[K+1][n+1];
        long[][] fmin = new long[K+1][n+1];
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i=1;i<=n;i++){
            fmax[1][i] = arr[i];
            fmin[1][i] = arr[i];
            for (int k=2;k<=K;k++){
                for (int j=i-1;j>0 && i-j<=D;j--){
                    if (max < Math.max(fmax[k-1][j]*arr[i], fmin[k-1][j]*arr[i]))
                        fmax[k][i] = Math.max(fmax[k-1][j]*arr[i], fmin[k-1][j]*arr[i]);
                    else if (min > Math.max(fmax[k-1][j]*arr[i], fmin[k-1][j]*arr[i]))
                        fmin[k][i] = Math.max(fmax[k-1][j]*arr[i], fmin[k-1][j]*arr[i]);
                }
            }
            res = Math.max(res, fmax[K][i]);
        }
        System.out.println(res);
    }
}
