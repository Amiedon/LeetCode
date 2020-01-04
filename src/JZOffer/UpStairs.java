package JZOffer;

/**
 * Created by Amie on 2018/7/25.
 */
public class UpStairs {
    public int get_upstairs(int n){
        if (n ==1 || n==2)
            return n;
        int a = 1;
        int b = 2;
        for (int i=3;i<=n;i++){
            int temp = a+b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(new UpStairs().get_upstairs(5));
    }
}
