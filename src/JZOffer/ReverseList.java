package JZOffer;

import com.sun.org.apache.regexp.internal.RE;

import java.util.Stack;

/**
 * Created by Amie on 2018/7/17.
 */
public class ReverseList {
    public static ListNode ReverseList(ListNode node){
        if (node == null)
            return null;
        Stack<ListNode> stack = new Stack<>();
        while (node.next!=null){
            stack.push(node);
            node = node.next;
        }
        stack.push(node);
        ListNode head = null;
        head = stack.pop();
        ListNode last = head;
        while (!stack.isEmpty()){
            last.next = stack.pop();
            last = last.next;
        }
        last.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(3);
        node.next = new ListNode(2);
        node.next.next = new ListNode(1);
        ListNode head = ReverseList.ReverseList(node);
        while (head.next!=null){
            System.out.println(head.value);
            head = head.next;
        }
        System.out.println(head.value);
    }
}
