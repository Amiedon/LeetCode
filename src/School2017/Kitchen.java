package School2017;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Amie on 2018/7/26.
 */
public class Kitchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        while (scanner.hasNext()){
            hashSet.add(scanner.next());
        }
        System.out.println(hashSet.size());
    }
}
