package JZOffer;

import java.util.ArrayList;

/**
 * Created by Amie on 2018/7/25.
 */
public class FindContinuesSequence {
    public ArrayList<ArrayList<Integer>> findcontinuesSequence(int sum){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (sum<3)
            return result;
        int small = 1;
        int big = 2;
        int cursum = small+big;
        while (small<(sum+1)/2){
            if (cursum == sum && small!=big)
                result.add(getsequence(small, big));
            while (cursum > sum){
                cursum-=small;
                small++;
                if (cursum==sum && small!=big)
                    result.add(getsequence(small, big));
            }
            big++;
            cursum+=big;
        }
        return result;
    }

    private ArrayList<Integer> getsequence(int small, int big) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=small;i<=big;i++)
            list.add(i);
        return list;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result = new FindContinuesSequence().findcontinuesSequence(3);
        System.out.println(result);
    }
}
