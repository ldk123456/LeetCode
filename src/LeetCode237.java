
public class LeetCode237 {
    public static void main(String[] args) {
        ListNode root=ListNode.getListNode();
        deleteNode(root);
        ListNode.sout(root);
    }
    //删除链表中的节点
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
