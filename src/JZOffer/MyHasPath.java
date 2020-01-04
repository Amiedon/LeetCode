package JZOffer;

/**
 * Created by Amie on 2018/7/26.
 */
public class MyHasPath {
    public static boolean haspath(char[] matrix, int rows, int cols, char[] str){
        int[] flag = new int[matrix.length];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (haspathhelper(matrix, rows, cols, i, j, str, flag, 0))
                    return true;
            }
        }
        return false;
    }

    private static boolean haspathhelper(char[] matrix, int rows, int cols, int i, int j, char[] str, int[] flag, int k) {
        int index = i*cols+j;
        if (i>=rows || j>=cols || i<0 || j<0 || flag[index] == 1|| matrix[index]!=str[k])
            return false;
        if (k == str.length)
            return true;
        flag[index] = 1;
        if (haspathhelper(matrix, rows, cols, i+1, j, str, flag, k+1) || haspathhelper(matrix, rows, cols, i-1, j, str, flag, k+1)||
                haspathhelper(matrix, rows, cols, i, j+1, str, flag, k+1) || haspathhelper(matrix, rows, cols, i, j-1, str, flag, k+1))
            return true;
        flag[index] = 0;
        return false;
    }
}
