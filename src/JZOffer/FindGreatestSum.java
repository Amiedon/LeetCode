package JZOffer;

/**
 * Created by Amie on 2018/7/23.
 */
public class FindGreatestSum {
    public int findGreatest(int [] num){
        int sum = 0;
        int max = 0;
        for (int i=0;i<num.length;i++){
            if (sum<0)
                sum = num[i];
            else sum+=num[i];
            if (sum>max)
                max = sum;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new FindGreatestSum().findGreatest(new int[]{1, 2, 3, -1, -2}));
    }
}
