package JZOffer;

/**
 * Created by Amie on 2018/7/24.
 */
public class FirstNotRepeatChar {
    public int findIndexFirst(String str){
        int [] map = new int[256];
        for (int i=0;i<str.length();i++){
            map[str.charAt(i)]++;
        }
        for (int i=0;i<str.length();i++){
            if (map[str.charAt(i)] == 1)
                System.out.println(str.charAt(i));
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FirstNotRepeatChar().findIndexFirst("baaaaaccc"));
        System.out.println('b');
    }
}
