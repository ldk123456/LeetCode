public class LeetCode19 {
    public static void main(String[] args) {
        ListNode root=ListNode.getListNode();
        root=removeNthFromEnd(root, 3);
        ListNode.sout(root);
    }
    //删除链表的倒数第N个节点
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode listNode1=head;
        ListNode listNode2=head;
        if (n<=0)
            return head;
        for (int i = 0; i < n; i++) {
            listNode1=listNode1.next;
        }
        if (listNode1==null)
            return head.next;
        while (listNode1.next!=null){
            listNode1=listNode1.next;
            listNode2=listNode2.next;
        }
        listNode2.next=listNode2.next.next;
        return head;
    }
}
