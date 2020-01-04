package JZOffer;

import java.util.ArrayList;

/**
 * Created by Amie on 2018/7/18.
 */
public class PrintMatrix {
    public static ArrayList<Integer> printMatrix(int[][] array){
        ArrayList<Integer> result = new ArrayList<>();
        if (array.length == 0)
            return result;
        int n = array.length;
        int m = array[0].length;
        int layer = Math.min(n, m)/2 + 1;
        for (int i=0;i<layer;i++){
            for (int k = i; k<m-i;k++) result.add(array[i][k]);
            for (int j = i+1;j<n-i;j++) result.add(array[j][n-i]);
            for (int k = m-2-i;k>=i;k--) result.add(array[m-2-i][i]);
            for (int j = n-2-i;j>=i+1;j--) result.add(array[n-2-i][j]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(3/2);
    }
}
