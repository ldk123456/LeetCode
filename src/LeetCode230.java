import java.util.Stack;

/**
 * 二叉搜索树中第K小的元素
 */
public class LeetCode230 {
    /**
     * 中序遍历，第k个节点返回值
     */
    public int kthSmallest(TreeNode root, int k) {
        if (root==null || k<=0)
            return 0;
        TreeNode p=root;
        Stack<TreeNode> stack=new Stack<>();
        while (p!=null||!stack.isEmpty()){
            if (p!=null){
                stack.push(p);
                p=p.left;
            }else {
                p=stack.pop();
                if (--k==0){
                    return p.val;
                }
                p=p.right;
            }
        }
        return 0;
    }
}
