package LeetCode;

import JZOffer.ListNode;

/**给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

 来源：力扣（LeetCode）
 链接：https://leetcode-cn.com/problems/add-two-numbers
 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * Created by Amie on 2019/8/31.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode listNode1, ListNode listNode2){
        ListNode head = new ListNode(0);
        ListNode p1 = listNode1, p2 = listNode2, current = head;
        int carry = 0;
        while (p1 !=null || p2!=null){
            int x = (p1!=null)? p1.value:0;
            int y = (p2!=null)? p2.value:0;
            int sum = x+y+carry;
            carry = sum/10;
            current.next = new ListNode(sum%10);
            current = current.next;
            if (p1 !=null) p1 = p1.next;
            if (p2 !=null) p2 = p2.next;
        }
        if (carry >0)
            current.next = new ListNode(carry);
        return head.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        listNode1.next = new ListNode(4);
        listNode1.next.next = new ListNode(3);
        listNode1.next.next.next = null;
        ListNode listNode2 = new ListNode(5);
        listNode2.next = new ListNode(6);
        listNode2.next.next = new ListNode(4);
        listNode2.next.next.next = null;
        ListNode listNode = new AddTwoNumbers().addTwoNumbers(listNode1, listNode2);
        while (listNode!=null){
            System.out.println(listNode.value);
            listNode = listNode.next;
        }
    }
}
