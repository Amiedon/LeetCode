package JZOffer;

/**
 * Created by Amie on 2018/7/24.
 */
public class FindFirstCommonNode {
    public ListNode findfirstNode(ListNode pHead1, ListNode pHead2){
        int length1 = getlength(pHead1);
        int length2 = getlength(pHead2);
        int step = length1 - length2;
        ListNode Head1 = pHead1;
        ListNode Head2 = pHead2;
        if (step < 0){
            Head1 = pHead2;
            Head2 = pHead1;
            step = length2 - length1;
        }
        while (Head1!=null && Head2!=null && Head1.value!=Head2.value){
            Head1 = Head1.next;
            Head2 = Head2.next;
        }
        return Head1;
    }

    private int getlength(ListNode head) {
        int length=0;
        ListNode pHead = head;
        while (pHead!=null){
            pHead = pHead.next;
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        ListNode pHead1 = new ListNode(3);
        pHead1.next = new ListNode(2);
        pHead1.next.next = new ListNode(1);
        ListNode pHead2 = new ListNode(6);
        pHead2.next = new ListNode(7);
        pHead2.next.next = new ListNode(1);
        ListNode node = new FindFirstCommonNode().findfirstNode(pHead1, pHead2);
        System.out.println(node.value);
    }
}
