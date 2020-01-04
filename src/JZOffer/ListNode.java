package JZOffer;

/**
 * Created by Amie on 2018/7/16.
 */
public class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int data){
        this.value = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListNode listNode = (ListNode) o;

        if (value != listNode.value) return false;
        return next != null ? next.equals(listNode.next) : listNode.next == null;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }
}
