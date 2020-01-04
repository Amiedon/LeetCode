package School2017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Amie on 2018/7/28.
 */
public class LineCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int array[] = new int[n];
        int flag[] = new int[n+1];
        for (int i=0;i<n;i++){
            array[i] = scanner.nextInt();
            flag[array[i]] = 1;
        }
        ArrayList<Integer> list = get_list(flag);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        get_perm_list(result, list, 0);
        System.out.println(result);
    }

    public static ArrayList<Integer> get_list(int flag[]){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i=1;i<flag.length;i++){
            if (flag[i] == 0){
                result.add(i);
            }
        }
        return result;
    }

    public static void get_perm_list(ArrayList<ArrayList<Integer>> perm, ArrayList<Integer> list, int n){
        if (n == list.size()-1){
            perm.add(new ArrayList<>(list));
        }else {
            for (int i=n;i<list.size();i++){
                Collections.swap(list, n, i);
                get_perm_list(perm, list, n+1);
                Collections.swap(list, n, i);
            }
        }
    }

    public static int count(int[] array){
        int tt = 0;
        for (int i=0;i<array.length-1;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]<array[j])
                    tt++;
            }
        }
        return tt;
    }

    public static int calVerse(int[] A, ArrayList<ArrayList<Integer>> arrayLists, int k){
        int tt = 0;
        for (int i=0;i<arrayLists.size();i++){
            int [] temp = new int[A.length];
            int index = 0;
            for (int j=0;j<A.length;j++){
                if (A[j] == 0){
                    temp[j] = arrayLists.get(i).get(index);
                    index++;
                }
                else {
                    temp[j] = A[j];
                }
            }
            if (count(temp) == k)
                tt++;
        }
        return tt;
    }
}
