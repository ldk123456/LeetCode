public class LeetCode21 {
    public static void main(String[] args) {
        ListNode listNode1=ListNode.getListNode1();
        ListNode listNode2=ListNode.getListNode2();
        ListNode.sout(mergeTwoLists(listNode1, listNode2));
    }
    //合并两个有序链表
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = null;
        if (l1.val <= l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l2.next, l1);
        }
        return head;
        /*ListNode head=new ListNode(0);
        ListNode addList=head;
        while (l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                head.next=l1;
                l1=l1.next;
                head=head.next;
            }else {
                head.next=l2;
                l2=l2.next;
                head=head.next;
            }
        }
        while (l1!=null){
            head.next=l1;
            l1=l1.next;
            head=head.next;
        }
        while (l2!=null){
            head.next=l2;
            l2=l2.next;
            head=head.next;
        }
        return addList.next;*/
    }
}
