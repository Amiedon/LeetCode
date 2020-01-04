package LeetCode.Nov_25;

/**
 * f[m][n] = f[m-1][n] + f[m][n-1];
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        for(int i=0;i<m;i++) f[i][0] = 1;
        for(int j=0;j<n;j++) f[0][j] = 1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                f[i][j] = f[i-1][j] + f[i][j-1];
            }
        }
        return f[m-1][n-1];
    }

    public static void main(String[] args) {
        System.out.println(new UniquePaths().uniquePaths(7, 3));
    }
}
