package School2017;

import java.util.Scanner;

/**
 * Created by Amie on 2018/7/26.
 */
public class Xingji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long h = scanner.nextLong();
        long max = (long) Math.sqrt(h);
        for (long i=max;i>0;i--){
            if (i*i+i<=h)
            {
                System.out.println(i);
                return;
            }

        }
    }
}
