import java.util.Stack;

public class LeetCode234 {
    public static void main(String[] args) {
        ListNode listNode=ListNode.getListNode();
        System.out.println(isPalindrome(listNode));
    }
    //回文链表
    public static boolean isPalindrome(ListNode head) {
        /*if (head == null || head.next == null) {
            return true;
        }
        if (head.val == head.next.val && head.next.next == null) {
            return true;
        }
        //到这时，链表的长度为3
        ListNode slow = head;
        ListNode cur = head.next;
        while(cur.next != null){
            if(cur.next.val == slow.val){
                if(cur.next.next != null) {
                    return false;
                }//避免1011 第三个出现和第一个相同的，但是还有第四个的情况
                cur.next = null;
                slow = slow.next;
                cur = slow.next;
                if (cur == null || slow.val == cur.val) {
                    return true;
                }
            }else{
                cur = cur.next;
            }
        }
        return false;*/
        ListNode slow=head;
        ListNode fast=head;

        if(fast==null||fast.next==null)//0个节点或是1个节点
            return true;


        while(fast.next!=null&&fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        //对链表后半段进行反转
        ListNode midNode=slow;
        ListNode firNode=slow.next;//后半段链表的第一个节点
        ListNode cur=firNode.next;//插入节点从第一个节点后面一个开始
        firNode.next=null;//第一个节点最后会变最后一个节点
        while(cur!=null)
        {
            ListNode nextNode=cur.next;//保存下次遍历的节点
            cur.next=midNode.next;
            midNode.next=cur;
            cur=nextNode;
        }

        //反转之后对前后半段进行比较
        slow=head;
        fast=midNode.next;
        while(fast!=null)
        {
            if(fast.val!=slow.val)
                return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;

    }
}
