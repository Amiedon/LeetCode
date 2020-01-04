package School2017;

import java.util.Scanner;

/**
 * Created by Amie on 2018/9/9.
 */
public class FindMaxhw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
    }

    public static void getstr(String string){
        boolean dp[][];
        if (string.length() == 0)
            return;
        if (string.length() == 1)
            System.out.println(string);
        dp = new boolean[string.length()][string.length()];
        int max = 1;
        int start = 0;
        int end = 0;
        int k;
        for (int i=0;i<string.length();i++){
            for (int j=0;j<string.length();j++){
                //if (i>=j)
            }
        }
    }
}
