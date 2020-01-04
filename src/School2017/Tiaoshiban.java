package School2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Amie on 2018/9/1.
 */
public class Tiaoshiban {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        System.out.println(deal(N, M));
    }
    public static int deal(int m, int n){
        // 从m 到 n
        int mark[] = new int[n+1];
        for (int i=m+1;i<=n;i++){
            mark[i] = Integer.MAX_VALUE;
        }
        for (int i=m;i<n-1;i++){
            if (mark[i] == Integer.MAX_VALUE) continue;
            ArrayList<Integer> arrayList = get_factor(i);
            for (int j=0;j<arrayList.size();j++){
                int temp = i+arrayList.get(j);
                int count = mark[i] +1;
                if (temp <=n && count<mark[temp])
                    mark[temp] = count;
            }
        }
        return mark[n];
    }

    private static ArrayList<Integer> get_factor(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=2; i<n;i++){
            int temp = n/i;
            if (temp*i == n){
                if (!result.contains(temp))
                    result.add(temp);
                if (!result.contains(i))
                    result.add(i);
            }
        }
        return result;
    }
}
