package School2017;

import java.util.Scanner;

/**
 * Created by Amie on 2018/8/7.
 */
public class FindTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int [][] matrix = new int[1000][1000];
        matrix[0][2] = -1;
        matrix[2][0] = -1;
        int count = 0;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (matrix[i][j] == 0){
                    count++;
                    if (i+2<M)
                        matrix[i][j] = -1;
                    if (j+2<N)
                        matrix[i][j] = -1;
                }
            }
        }
        System.out.println(count);
    }
}
