package JZOffer;

/**
 * Created by Amie on 2018/7/23.
 */
public class NumberOf1 {
    public int numberof1(int n){
        if (n<0)
            return 0;
        int count = 0;
        for (int i=1; i<=n;i++){
            int s = i;
            while (s>0){
                if (s%10==1)
                    count++;
                s/=10;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new NumberOf1().numberof1(13));
    }
}
