import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的锯齿形层次遍历
 */
public class LeetCode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int floor = 1;
        //s1存奇数层节点
        Stack<TreeNode> s1 = new Stack<>();
        s1.push(root);
        //s2存偶数层节点
        Stack<TreeNode> s2 = new Stack<>();

        List<List<Integer>> list = new ArrayList<>();

        while (!s1.empty() || !s2.empty()) {
            if (floor%2 != 0) {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s1.empty()) {
                    TreeNode node = s1.pop();
                    if(node != null) {
                        temp.add(node.val);
                        s2.push(node.left);
                        s2.push(node.right);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    floor++;
                }
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                while (!s2.empty()) {
                    TreeNode node = s2.pop();
                    if(node != null) {
                        temp.add(node.val);
                        s1.push(node.right);
                        s1.push(node.left);
                    }
                }
                if (!temp.isEmpty()) {
                    list.add(temp);
                    floor++;
                }
            }
        }
        return list;
    }
}
