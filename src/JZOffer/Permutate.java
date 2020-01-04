package JZOffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Amie on 2018/7/23.
 */
public class Permutate {
    public ArrayList Permutation(String str){
        ArrayList<String> result = new ArrayList<>();
        if (str!=null && str.length()>0){
            PermutationHelper(str.toCharArray(), 0, result);
            //Collections.sort(result);
        }
        return result;
    }

    private void PermutationHelper(char[] chars, int i, ArrayList<String> result) {
        if (i == chars.length-1){
            String string = String.valueOf(chars);
            if (!result.contains(string)){
                result.add(string);
            }
        }else {
            for (int j=i;j<chars.length;j++){
                swap(chars, i, j);
                PermutationHelper(chars, i+1, result);
                swap(chars, i, j);
            }
        }
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new Permutate().Permutation("abc");
        System.out.println(arrayList);
    }
}
