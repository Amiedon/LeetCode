package JZOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Amie on 2018/7/23.
 */
public class PrintMinNum {
    public String printMinnum(int[] nums){
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<n;i++){
            list.add(nums[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o2;
                return s1.compareTo(s2);
            }
        });
        String s = "";
        for (int j: list){
            s+=j;
        }
        return s;
    }
}
