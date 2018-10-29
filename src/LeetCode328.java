/**
 * 奇偶链表
 */
public class LeetCode328 {
    public ListNode oddEvenList(ListNode head) {
        if (head==null || head.next==null )
            return head;
        ListNode pre=head;
        ListNode next=head.next;
        ListNode temp=next;
        while (pre.next!=null && next.next!=null){
            pre.next=next.next;
            pre=pre.next;
            next.next=pre.next;
            next=next.next;
        }
        pre.next=temp;
        return head;
    }
}
