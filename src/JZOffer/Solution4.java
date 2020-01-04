package JZOffer;

/**
 * Created by Amie on 2018/7/16.
 */
public class Solution4 {
    public static void main(String[] args) {
        int [][]  matrix= new int[3][4];
        System.out.println(matrix.length);
    }

    public static boolean Find(int[][] matrix, int target){
        int row = matrix.length;
        int col = matrix[0].length;
        int i = col - 1;
        int j = 0;
        while (i>=0 && j<row){
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] < target)
                j++;
            else
                i--;
        }
        return false;
    }
}
