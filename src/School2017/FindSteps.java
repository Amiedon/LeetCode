package School2017;

import java.util.Scanner;

/**
 * Created by Amie on 2018/8/13.
 */
public class FindSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getCount(n));
    }

    public static int getCount(int n){
        int small = 0;
        int big = 1;
        int temp = 0;
        while (true){
            if (big >= n)
                break;
            temp = small+big;
            small = big;
            big = temp;
        }
        if (big -n < n-small)
            return big-n;
        else
            return n-small;
    }
}
