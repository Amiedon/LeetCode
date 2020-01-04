package School2017;

import java.util.Scanner;

/**
 * Created by Amie on 2018/8/13.
 */
public class JudgeABC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i=0;i<n;i++){
            strings[i] = scanner.nextLine();
        }
    }

    public static boolean lengthSort(String[] strings){
        for (int i=0;i<strings.length-1;i++){
            if (strings[i].length()> strings[i+1].length()){
                return false;
            }
        }
        return true;
    }

    public static boolean abcSort(String[] strings){
        for (int i=0;i<strings.length-1;i++){
            if (strings[i].compareTo(strings[i+1]) >0)
                return false;
        }
        return true;
    }
}
