package JZOffer;

/**
 * Created by Amie on 2018/7/18.
 */
public class VerifySequceOfBST {
    public static boolean check(int[] sequence){
        if (sequence.length == 0)
            return false;
        if (sequence.length ==1)
            return true;
        int start=0;
        int root = sequence.length-1;
        return local_check(sequence, start, root);
    }

    private static boolean local_check(int[] sequence, int start, int root) {
        if (start >= root)
            return true;
        int i = start;
        while (sequence[i] < sequence[root])
            ++i ;
        for (int j=i;j<root;j++)
        {
            if (sequence[j] < sequence[root])
                return false;
        }
        return local_check(sequence, start, i-1) && local_check(sequence, i, root-1);
    }

    public static void main(String[] args) {
        System.out.println(check(new int[]{5, 4, 3, 2, 1}));
    }
}
