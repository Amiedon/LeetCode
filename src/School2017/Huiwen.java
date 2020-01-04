package School2017;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Amie on 2018/9/1.
 */
public class Huiwen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i] = scanner.nextInt();
        }
        Deque<Integer> deque = new LinkedList<>();
        for (int i=0;i<nums.length;i++){
            deque.addFirst(nums[i]);
        }
        int count = 0;
        while (deque.size()>1){
            if (deque.peekFirst().equals(deque.peekLast())){
                deque.removeFirst();
                deque.removeLast();
            }
            else {
                if (deque.peekFirst()>deque.peekLast()){
                    int temp1 = deque.removeLast();
                    int temp2 = deque.removeLast();
                    deque.addLast(temp1+temp2);
                    count++;
                }else {
                    int temp1 = deque.removeFirst();
                    int temp2 = deque.removeFirst();
                    deque.addFirst(temp1+temp2);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
