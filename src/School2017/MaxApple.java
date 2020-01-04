package School2017;

/**
 * Created by Amie on 2018/7/26.
 */
public class MaxApple {
    public static int findMaxApple(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = matrix;
        result[0][0] = matrix[0][0];
        for (int i=1;i<rows;i++){
            result[i][0] += result[i-1][0];
        }
        for (int j=1;j<cols;j++){
            result[0][j] += result[0][j-1];
        }
        for (int i=1;i<rows;i++){
            for (int j=1;j<cols;j++){
                if (i-1>=0 && j-1>=0){
                    result[i][j] = Math.max(result[i-1][j], result[i][j-1]) + result[i][j];
                }
            }
        }
        return result[rows-1][cols-1];
    }

    public static void main(String[] args) {
        int [][] matrix = {{1, 2, 3},{4, 5, 6}, {7, 8, 9}};
        System.out.println(MaxApple.findMaxApple(matrix));
    }
}
