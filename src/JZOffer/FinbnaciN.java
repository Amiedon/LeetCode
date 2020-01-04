package JZOffer;

/**
 * Created by Amie on 2018/7/17.
 */
public class FinbnaciN {
    public static int FindN(int n){
        int f1 = 0;
        int f2 = 1;
        while (n-- >0){
            int temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        }
        return f2;
    }

    public static void main(String[] args) {
        System.out.println(FindN(3));
    }
}
