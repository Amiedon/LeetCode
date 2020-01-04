package School2017;

import java.util.Scanner;

/**
 * Created by Amie on 2018/9/1.
 */
public class FindYOUYA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int r0 = (int)Math.sqrt(r);
        int count = 0;
        for (int i=1;i<r0;i++){
            int x =(int) Math.sqrt(r - i*i);
            if (x*x + i*i == r){
                count++;
            }
        }
        System.out.println(count*4+4);
    }
}
