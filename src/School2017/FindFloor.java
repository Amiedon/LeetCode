package School2017;

import java.util.Scanner;

/**
 * Created by Amie on 2019/7/25.
 */
public class FindFloor {
    public static void main(String[] args) {
        int floor = 3;
        int num = 4;//手中的编号
        int count = 0;
        for (int i=1;i<num;i++){
            if (isGao(floor, i))
                count++;
        }
        System.out.println(num- count);
    }

    static boolean  isGao(int n, int floor){
        while (floor !=0){
            if ((floor%10)== n){
                return true;
            }
            floor /=10;
        }
        return false;
    }
}
