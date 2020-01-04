package School2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Amie on 2018/8/7.
 */
public class GetLuckNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        //System.out.println(getLuckNum(nums, 0, 0, 1));
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        System.out.println(find(nums, 0, 0, 1, result));
        System.out.println(result);
        System.out.println(result.size());
    }

    public static int getLuckNum(int[] nums, int index, int sum, int multi){
        int count = 0;
        for (int i=index; i<nums.length;i++){
            sum+=nums[i];
            multi*=nums[i];
            if (sum > multi)
                count+=1+getLuckNum(nums, index+1, sum, multi);
            else if (nums[i] == 1)
                count+=getLuckNum(nums, index+1, sum, multi);
            else
                break;
            sum-=nums[i];
            multi/=nums[i];
            while (i<nums.length-1 && nums[i] == nums[i+1])
                i++;
        }
        return count;
    }

    public static int find(int[] nums, int index, int sum, int multi, ArrayList<ArrayList<Integer>> result){
        int count = 0;
        ArrayList<Integer> line = new ArrayList<>();
        for (int i=index;i<nums.length;i++){
            sum += nums[i];
            multi *= nums[i];
            line.add(nums[i]);
            if (sum > multi) {
                result.add(new ArrayList<>(line));
                count += 1 + find(nums, index + 1, sum, multi, result);
            }
            else if (nums[i] == 1) {
                result.add(new ArrayList<>(line));
                count += find(nums, index + 1, sum, multi, result);
            }
            else break;
            sum -= nums[i];
            multi /= nums[i];
            while (i<nums.length-1 && nums[i] == nums[i+1])
                i++;
        }

        return count;
    }
}
