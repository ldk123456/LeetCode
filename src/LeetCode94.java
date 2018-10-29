import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 中序遍历二叉树
 */
public class LeetCode94 {
    /**
     * 中序遍历二叉树（非递归）
     *
     * 思路：先将T入栈，遍历左子树；遍历完左子树返回时，栈顶元素应为T，
     *       出栈，访问T->data，再中序遍历T的右子树。
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if (root==null)
            return list;
        TreeNode p=root;//p为当前节点
        LinkedList<TreeNode> stack=new LinkedList<>();
        //栈不为空时，或者p不为空时循环
        while(p!=null || !stack.isEmpty()) {
            //当前节点不为空。压入栈中。并将当前节点赋值为左儿子
            if (p!=null) {
                stack.push(p);
                p=p.left;
            }
            //当前节点为空：
            //  1、当p指向的左儿子时，此时栈顶元素必然是它的父节点
            //  2、当p指向的右儿子时，此时栈顶元素必然是它的爷爷节点
            //取出并访问栈顶元素，赋值为right
            else {
                p=stack.pop();
                list.add(p.val);
                p=p.right;
            }
        }
        return list;
    }

    /**
     * 先序遍历二叉树（非递归）
     * 思路：对于任意节点T，访问这个节点并压入栈中，然后访问节点的左子树，
     *      遍历完左子树后，取出栈顶的节点T，再先序遍历T的右子树
     */
    public void PrintBinaryTreePreUnrecur(TreeNode root) {
        TreeNode p=root;//p为当前节点
        LinkedList<TreeNode> stack=new LinkedList<>();
        //栈不为空时，或者p不为空时循环
        while(p!=null || !stack.isEmpty()) {
            //当前节点不为空。访问并压入栈中。并将当前节点赋值为左儿子
            if (p!=null) {
                stack.push(p);
                System.out.print(p.val);
                p=p.left;
            }
            //当前节点为空：
            //  1、当p指向的左儿子时，此时栈顶元素必然是它的父节点
            //  2、当p指向的右儿子时，此时栈顶元素必然是它的爷爷节点
            //取出栈顶元素，赋值为right
            else {
                p=stack.pop();
                p=p.right;
            }
        }
    }
    /**
     * 后序遍历二叉树（非递归）
     *
     */
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode prior = null;
        ArrayList<Integer> ans = new ArrayList<>();
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                if (cur.right == null || cur.right == prior) {
                    ans.add(cur.val);
                    prior = cur;
                    cur = null;
                } else {
                    stack.push(cur);
                    cur = cur.right;
                    stack.push(cur);
                    cur = cur.left;
                }
            }
        }
        return ans;
    }
    /**
     * 层次遍历二叉树（非递归）
     */
    public void PrintBinaryTreeLayerUnrecur(TreeNode root)
    {
        LinkedList<TreeNode> queue=new LinkedList<>();
        TreeNode p;
        queue.push(root);
        while(!queue.isEmpty()) {
            p=queue.removeFirst();
            System.out.print(p.val);
            if (p.left!=null)
                queue.addLast(p.left);
            if (p.right!=null)
                queue.addLast(p.right);
        }
    }
}
