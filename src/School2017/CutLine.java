package School2017;

/**
 * Created by Amie on 2018/7/26.
 */
public class CutLine {
    public static int cut(int n){
        int result = Integer.MIN_VALUE;
        if (n<2)
            return 0;
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        f[2] = 2;
        f[3] = 3;
        for (int i=4;i<=n;i++){
            int max = 0;
            for (int j = 1;j<i;j++){
                int temp = f[i-j] * f[j];
                if (max < temp)
                    max = temp;
                f[i] = max;
            }
        }
        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(new CutLine().cut(8));
    }
}
