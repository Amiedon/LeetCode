package JZOffer;

import java.util.ArrayList;

/**
 * Created by Amie on 2018/7/24.
 */
public class UglyNum {
    public int GetUglyNum(int n){
        if (n<=0)
            return 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int i2=0, i3=0, i5=0;
        while (list.size()<n){
            int min2 = list.get(i2)*2;
            int min3 = list.get(i3)*3;
            int min5 = list.get(i5)*5;
            int min = Math.min(min2, Math.min(min3, min5));
            if (min == min2) i2++;
            if (min == min3) i3++;
            if (min == min5) i5++;
            list.add(min);
        }
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        System.out.println(new UglyNum().GetUglyNum(10));
    }
}
