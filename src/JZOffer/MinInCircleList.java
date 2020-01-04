package JZOffer;

/**
 * Created by Amie on 2018/7/17.
 */
public class MinInCircleList {
    public static int find(int [] nums){
        if(nums.length<=0){
            return 0;
        }
        int low = 0;
        int high = nums.length-1;
        while (low<high-1){
            int mid = (low+high)/2;
            if (nums[mid] >= nums[low])
                low = mid;
            if (nums[mid] <= nums[high])
                high = mid;
        }
        return nums[high];
    }

    public static void main(String[] args) {
        System.out.println(MinInCircleList.find(new int[]{3, 4, 5, 1, 2}));
    }
}
