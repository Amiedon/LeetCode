package JZOffer;

/**
 * Created by Amie on 2018/7/24.
 */
public class GetNumberOfK {
    public int getNumberOfK(int [] array, int k){
        int length = array.length;
        if (length == 0)
            return 0;
        int start = getFirstK(array, 0, length-1, k);
        int end = getLastK(array, 0, length, k);
        return end-start+1;
    }

    private int getFirstK(int[] array, int start, int end, int k) {
        if (start>end)
            return -1;
        int mid = (start+end)>>1;
        if (array[mid] > k){
            return getFirstK(array, start, mid-1, k);
        }
        else if (array[mid] < k){
            return getFirstK(array, mid+1, end, k);
        }
        else if (mid-1>=0 && array[mid-1] == k)
            return getFirstK(array, start, mid-1, k);
        else
            return mid;
    }

    private int getLastK(int[] array, int start, int end, int k) {
        int mid = (start+end)>>1;
        while (start < end){
            if (array[mid]> k){
                end = mid -1;
            }
            else if (array[mid] < k){
                start = mid+1;
            }
            else if (mid+1<array.length && array[mid+1] == k){
                start = mid+1;
            }
            else
                return mid;
            mid = (start+end)>>1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 3, 3, 3, 4};
        System.out.println(new GetNumberOfK().getNumberOfK(nums, 3));
    }
}
