package School2017;

/**
 * Created by Amie on 2018/7/26.
 */
public class FindLCS {
    public static int[][] getLength(String x, String y){
        char[] char_x = x.toCharArray();
        char[] char_y = y.toCharArray();
        int[][] b = new int[x.length()+1][y.length()+1];
        int[][] c = new int[x.length()+1][y.length()+1];
        for (int i=0;i<c.length;i++){
            c[i][0] = 0;
        }
        for (int j=0;j<c[0].length;j++){
            c[0][j] = 0;
        }
        for (int i=1;i<c.length;i++){
            for (int j=1;j<c[0].length;j++){
                if (char_x[i] ==  char_y[j]){
                    c[i][j] = c[i-1][j-1] +1;
                    b[i][j] = 1;
                }
                else if (c[i-1][j]>c[i][j-1]){
                    c[i][j] = c[i-1][j];
                    b[i][j] = -1;
                }
                else {
                    c[i][j] = c[i][j-1];
                    b[i][j] = 0;
                }
            }
        }
        return b;
    }
    public static void Display(int[][] b, String x, int i, int j){
        char[] ss = x.toCharArray();
        if (i==0 || j==0)
            return;
        if (b[i][j] == 1){
            Display(b, x, i-1, j-1);
            System.out.println(ss[i]+" ");
        }
        else if (b[i][j] == -1){
            Display(b, x, i-1, j);
        }
        else if (b[i][j] == 0){
            Display(b, x, i, j-1);
        }
    }

    public static void main(String[] args) {
        String ss = "sabcdss";
        String s2 = "sabcd3sss";
        int[][] b = FindLCS.getLength(ss, s2);
        Display(b, ss, 6, 8);
    }
}
