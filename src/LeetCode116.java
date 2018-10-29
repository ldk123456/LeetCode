/**
 * 每个节点的右向指针
 */
class TreeLinkNode {
    int val;
    TreeLinkNode left, right, next;
    TreeLinkNode(int x) { val = x; }
}
public class LeetCode116 {
    /**
     * 对于第一层只有root（如果其存在），那么需要看它的左孩子是否存在。
     * 如果存在，那么它的next一定等于root的右孩子，不论右孩子存不存在。
     * 而对于右孩子，仅仅对于第一层root来说，这一步不用做任何事，
     * 只不过如果root右孩子存在，那么此时它已经被连接到root左孩子的next上，
     * 而且它本身的next初始为null。这样继续递归调用下一层的节点时候，同样的左孩子如果存在，
     * 其next连到右孩子。而这时候要判断此时根节点的next是否为null。
     * 如果不为null，相当于此时根节点存在同层的兄弟节点，且这个兄弟节点已经存在当前递归节点的next域中。
     * 那么，如果这时根节点的右孩子也存在的话，它是一定等于根节点的兄弟节点的左孩子，不论其左孩子是否为空。
     * 之后递归调用每一层根节点的左右孩子即可。看上去很绕，但原理是每一次连上一个根节点的左右孩子，
     * 这样下一层时候就知道了兄弟节点是否存在，以便于继续链接根节点及其兄弟节点的孩子。
     */
    public void connect(TreeLinkNode root) {
        if (root==null)
            return;
        if (root.left!=null)
            root.left.next=root.right;
        if (root.right!=null && root.next!=null)
            root.right.next=root.next.left;
        connect(root.left);
        connect(root.right);

        /**
         * 将树的每一层节点用next串起来。这样每一层也会形成一个单链表。
         * 而每层的链表头，则是，根的左孩子，左孩子，左孩子。
         * 利用双循环，外层循环，沿着根的左孩子，一直向下。
         * 内层循环，负责将下一层的节点串起来。
         * 即，将自己右孩子放到左孩子的next上，而右孩子，则可通过自己的next指针，找到右邻居。
         */
        /*TreeLinkNode queue = root;
        TreeLinkNode level = new TreeLinkNode(0);
        while (queue != null) {
            level.next = null;
            TreeLinkNode current = level;
            while (queue != null) {
                if (queue.left != null) {
                    current.next = queue.left;
                    current = current.next;
                }
                if (queue.right != null) {
                    current.next = queue.right;
                    current = current.next;
                }
                queue = queue.next;
            }
            queue = level.next;
        }*/
    }
}
