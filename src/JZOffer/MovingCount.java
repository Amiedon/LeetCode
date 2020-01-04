package JZOffer;

/**
 * Created by Amie on 2018/7/20.
 */
public class MovingCount {
    public static int movingCount(int threshold, int rows, int cols){
        int [][] flag = new int[rows][cols];
        int count = movingCore(threshold, rows, cols, 0, 0, flag);
        return count;
    }

    private static int movingCore(int threshold, int rows, int cols, int i, int j, int[][] flag) {
        int count = 0;
        if (check(threshold, rows, cols, i, j, flag))
        {
            flag[i][j] = 1;
            count = 1+ movingCore(threshold, rows, cols, i-1, j, flag) + movingCore(threshold, rows, cols, i+1, j, flag)+
                    movingCore(threshold, rows, cols, i, j-1, flag) + movingCore(threshold, rows, cols, i, j+1, flag);
        }
        return count;
    }

    public static boolean check(int threshold, int rows, int cols, int i, int j, int [][] flag){
        if (i>=rows || i<0 || j>=cols || j<0 || flag[i][j] == 1 || (get_count(i) + get_count(j))> threshold)
            return false;
        return true;
    }

    public static int get_count(int num){
        int result = 0;
        while (num>0){
            result+= num%10;
            num/=10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MovingCount.get_count(32));
    }
}
