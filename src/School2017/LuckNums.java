package School2017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Amie on 2018/8/7.
 */
public class LuckNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> line  = new ArrayList<>();
        System.out.println(find(nums, 0, 0, 1, result, line));
        System.out.println(result);
    }

    private static int find(int[] nums, int index, long sum, long multi, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> line) {
        int count = 0;
        for (int i=index;i<nums.length;i++){
            sum+=nums[i];
            multi *= nums[i];
            line.add(nums[i]);
            if (sum > multi) {
                count += 1 + find(nums, index + 1, sum, multi, result, line);
            }
            else if (nums[i] == 1)
                count += find(nums, index+1, sum, multi, result, line);
            else {
                line.remove(line.size()-1);
                result.add(new ArrayList<>(line));
                line = new ArrayList<>();
                break;
            }
            sum -= nums[i];
            multi /= nums[i];
            while (i<nums.length-1 && nums[i] == nums[i+1])
                i++;
        }
        return count;
    }
}
