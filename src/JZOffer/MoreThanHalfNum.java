package JZOffer;

/**
 * Created by Amie on 2018/7/23.
 */
public class MoreThanHalfNum {
    public int morethanHalf(int[] num){
        int result = num[0];
        int times = 1;
        for (int i=0;i<num.length;i++){
            if (times == 0) {
                result = num[i];
                times = 0;
            }
            if (num[i] == result)
                times++;
            else
                times--;
        }
        if (check(num, result))
            return result;
        else
            return 0;
    }
    boolean check(int[] num, int result){
        int time = 0;
        for (int i=0;i<num.length;i++){
            if (num[i] == result)
                time++;
        }
        if (2*time<=num.length)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        System.out.println(new MoreThanHalfNum().morethanHalf(new int[]{1, 2, 1, 1,2}));
    }
}
