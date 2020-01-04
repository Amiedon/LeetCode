package JZOffer;

/**
 * Created by Amie on 2018/7/17.
 */
public class Find1Num {
    public static int FindNum(int n){
        int flag = 1;
        int count = 0;
        while (flag!=0){
            if ((n & flag) != 0)
                count++;
            flag=flag<<1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Find1Num.FindNum(3));
    }
}
