/**
 * 相交链表
 */
public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode p = headA;
        ListNode q = headB;
        int pn = 1;
        int qn = 1;
        while(p.next != null){
            pn++;
            p = p.next;
        }
        while(q.next != null){
            qn++;
            q = q.next;
        }
        if(p != q) return null;
        //reset p,q
        p = headA;
        q = headB;
        if(pn > qn){
            int d = pn - qn;
            while(d > 0 && p != null){
                p = p.next;
                d--;
            }
        }else if(pn < qn){
            int d = qn - pn;
            while (d >0 && q != null){
                q = q.next;
                d--;
            }
        }
        while(p != null && q != null){
            if(p == q) return q;
            p = p.next;
            q = q.next;
        }
        return null;
    }
}
