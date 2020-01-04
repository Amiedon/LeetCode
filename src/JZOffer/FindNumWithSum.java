package JZOffer;

import java.util.ArrayList;

/**
 * Created by Amie on 2018/7/25.
 */
public class FindNumWithSum {
    public ArrayList<Integer> findsumwithSum(int[] array, int sum){
        ArrayList<Integer> result = new ArrayList<>();
        int start = 0;
        int end = array.length-1;
        int cursum = 0;
        cursum = array[start] + array[end];
        while (start<end){
            if (cursum == sum){
                result.add(array[start]);
                result.add(array[end]);
                return result;
            }
            else if (cursum > sum){
                cursum-=array[end];
                end--;
            }
            else{
                cursum-=array[start];
                start++;
            }
            cursum = array[start] + array[end];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(new FindNumWithSum().findsumwithSum(array, 5));
    }
}
