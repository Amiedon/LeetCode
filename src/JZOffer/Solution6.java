package JZOffer;

/**
 * Created by Amie on 2018/7/16.
 */
public class Solution6 {
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        Solution6.printTree(head);
    }

    public static void printTree(ListNode listNode){
        if (listNode.next!=null)
            printTree(listNode.next);
        System.out.println(listNode.value);
    }
}
