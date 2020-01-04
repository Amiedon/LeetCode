package JZOffer;

/**
 * Created by Amie on 2018/7/20.
 */
public class MySwap {
    public static void swap(int[] a){
        int c = a[0];
        a[0] = a[1];
        a[1] = c;
    }

    public static void main(String[] args) {
        int [] ss = new int[]{1, 2};
        System.out.println(ss[0]+" "+ss[1]);
        swap(ss);
        System.out.println(ss[0]+" "+ss[1]);
    }
}
