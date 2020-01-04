package JZOffer;

/**
 * Created by Amie on 2018/7/17.
 */
public class ReOrderArray {
    public static void reOrder(int [] num){
        if (num == null || num.length == 0)
            return;
        for (int i=0;i<num.length;i++){
            if (isEven(num[i])){ //i是偶数位
                for (int j=i+1;j<num.length;j++){
                    if (!isEven(num[j]))//奇数位
                    {
                        int temp = num[j];
                        for (int k=j-1;k>=i;k--){
                            num[k+1] = num[k];
                        }
                        num[i] = temp;
                        break;
                    }

                }
            }
        }
    }

    public static boolean isEven(int n){
        if (n%2 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int [] num = new int[]{2, 3, 6, 1, 5, 10};
        ReOrderArray.reOrder(num);
        for (int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
