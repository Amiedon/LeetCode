package School2017;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Amie on 2018/8/13.
 */
public class FindSmallestEase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
    }

    public static int getSmallest(int[] nums){

        if (nums[0]!=1)
            return -1;
        else if (nums.length ==1)
            return nums[0]+1;
        else {
            int sum = nums[0];
            for (int i=1;i<nums.length;i++){
                if (nums[i] - sum > 1)
                    return sum+1;
                sum+=nums[i];
            }
            return sum+1;
        }
    }
}
