package School2017;

import java.util.Scanner;

/**
 * Created by Amie on 2018/7/26.
 */
public class CangBaoTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S_str = scanner.nextLine();
        String T_str = scanner.nextLine();
        int index = 0;
        for (int i=0;i<S_str.length();i++){
            if (S_str.charAt(i) == T_str.charAt(index)){
                index++;
            }
            if(index == T_str.length()){
                System.out.println("yes");
                break;
            }
        }
        if (index!=T_str.length()){
            System.out.println("No");
        }
    }
}
