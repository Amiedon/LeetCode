package JZOffer;

/**
 * Created by Amie on 2018/7/17.
 */
public class PowerN {
    public static double power(double base, int n){
        double res = 1;
        double cur = base;
        int exop = 0;
        if (n>0)
            exop = n;
        else if (n<0){
            if(base == 0)
            {
                System.out.println("分母不能为0");
                return 0;
            }
            else
                exop = -n;
        }
        else return 1;
        while (exop!=0){
            if ((exop&1) == 1){
                res *= cur;
            }
            cur *= cur;
            exop >>=1;
        }
        if (n>0)
            return res;
        else return 1/res;
    }

    public static void main(String[] args) {
        System.out.println(PowerN.power(3, 2));
    }
}
