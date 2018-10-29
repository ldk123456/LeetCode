public class LeetCode206 {
    public static void main(String[] args) {
        ListNode root=ListNode.getListNode();
        ListNode.sout(reverseList(root));
    }
    //反转链表
    public static ListNode reverseList(ListNode head) {
        if (head==null||head.next==null)
            return head;
        ListNode pre=null;
        ListNode next=null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}
