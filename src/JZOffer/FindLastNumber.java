package JZOffer;

/**
 * Created by Amie on 2018/7/25.
 */
public class FindLastNumber {
    public static int findlastnumber(int n, int m){
        if (n<1 || m<1)
            return -1;
        int[] array = new int[n];
        int count = n;
        int step = 0;
        int i = -1;
        while (count >0){
            i++;
            if (i>=n){
                i = 0;
            }
            if (array[i] == -1) continue;
            step++;
            if (step == m){
                step=0;
                array[i]=-1;
                count--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(FindLastNumber.findlastnumber(5, 3));
    }
}
