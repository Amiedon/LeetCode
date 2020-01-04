package JZOffer;

/**
 * Created by Amie on 2018/7/20.
 */
public class HashPath {
    public static boolean hasPath(char[] matrix, int rows, int cols, char[] str){
        int [] flag = new int[matrix.length];
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (hasPathHelper(matrix, i, j, rows, cols,  flag, str, 0))
                    return true;
            }
        }
        return false;
    }

    private static boolean hasPathHelper(char[] matrix, int i, int j, int rows, int cols, int[] flag, char[] str, int layer) {
        int index = i*cols + j;
        if (i>=rows || j>= cols || i<0 || j<0 || flag[index] == 1 || matrix[index]!= str[layer])
            return false;
        flag[index] = 1;
        if (layer == str.length-1)
            return true;

        if (hasPathHelper(matrix, i+1, j, rows, cols, flag, str, layer+1) ||
                hasPathHelper(matrix, i, j+1, rows, cols, flag, str, layer+1) ||
                hasPathHelper(matrix, i-1, j, rows, cols, flag, str, layer+1) ||
                hasPathHelper(matrix, i, j-1, rows, cols, flag, str, layer+1))
            return true;
        flag[index] = 0;
        return false;
    }

    public static void main(String[] args) {
        char[] matrix = new char[]{'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        System.out.println(HashPath.hasPath(matrix, 3, 4, new char[]{'b', 'c', 'c', 'e', 'd'}));
    }
}
