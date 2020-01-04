package School2017;

/**
 * Created by Amie on 2018/7/26.
 */
public class Coins {
    public static int finfcoinnum(int n){
        int [] coin_num = new int[n+1];
        coin_num[0] = 0;
        coin_num[1] = 1;
        int[] coins = {1, 3, 5};
        for (int i=1;i<=n;i++){
            int min = Integer.MAX_VALUE;
            for (int j=0;j<3;j++){
                if (i>=coins[j] && min > coin_num[i-coins[j]]){
                    min = coin_num[i-coins[j]];
                    coin_num[i] = min+1;
                }
            }
        }
        return coin_num[n];
    }

    public static void main(String[] args) {
        System.out.println(Coins.finfcoinnum(10));
    }
}
