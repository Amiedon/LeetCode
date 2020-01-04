package School2017;

import java.util.ArrayList;

/**
 * Created by Amie on 2018/8/7.
 */
public class LocalTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);
    }
}
