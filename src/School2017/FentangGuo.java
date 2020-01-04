package School2017;

import java.util.Scanner;

/**
 * Created by Amie on 2018/9/5.
 */
public class FentangGuo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] children = new int[n];
        for (int i=0;i<n;i++){
            children[i] = scanner.nextInt();
        }
        System.out.println(getCount(children));
    }
    public static int getCount(int [] children){
        int count = 0;
        while (!judge(children)){
            int temp = children[children.length-1];
            for (int i=1;i<children.length;i++){
                children[i] = children[i]+ children[i-1]/2;
            }
            children[0] = children[children.length-1]/2 + children[0];
            for (int i=0;i<children.length-1; i++){
                if (children[i]%2 !=0)
                    count++;
            }
        }
        return count;
    }

    private static boolean judge(int[] children) {
        for (int i=0;i<children.length-1;i++){
            if (children[i]!= children[i+1]){
                return false;
            }
        }
        return true;
    }
}
