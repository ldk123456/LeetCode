public class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
    }
    public static ListNode getListNode(){
        ListNode root=new ListNode(1);
        root.next=new ListNode(2);
        root.next.next=new ListNode(3);
        root.next.next.next=new ListNode(4);
        root.next.next.next.next=new ListNode(5);
        root.next.next.next.next.next=new ListNode(6);
        return root;
    }
    public static ListNode getListNode1(){
        ListNode root=new ListNode(1);
        root.next=new ListNode(2);
        root.next.next=new ListNode(4);
        return root;
    }
    public static ListNode getListNode2(){
        ListNode root=new ListNode(1);
        root.next=new ListNode(3);
        root.next.next=new ListNode(4);
        return root;
    }
    public static void sout(ListNode root){
        while (root!=null){
            System.out.println(root.val);
            root=root.next;
        }
    }
}
