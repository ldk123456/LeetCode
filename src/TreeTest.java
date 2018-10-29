import java.util.*;

public class TreeTest {
    //对称二叉树
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return isSymmetric(root.left,root.right);
    }
    public boolean isSymmetric(TreeNode l,TreeNode r) {
        if(l==null&&r==null) return true;
        if(l!=null&&r!=null){
            if(l.val!=r.val) return false;
            return isSymmetric(l.left,r.right)&&isSymmetric(r.left,l.right);
        }else
            return false;
    }
    //二叉树的层次遍历
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelList = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelList.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            result.add(levelList);
        }
        return result;
    }
    //将有序数组转换为二叉搜索树
    public static TreeNode sortedArrayToBST(int[] nums) {
        int end=nums.length;
        if(end<=0)
            return null;
        return buildTree(nums, 0, end-1);//因为从0开始计数 所以减一

    }
    public static TreeNode buildTree(int[] nums,int start,int end)
    {
        if(start<=end)
        {
            int mid=(start+end)/2;
            TreeNode root=new TreeNode(nums[mid]);
            root.left=buildTree(nums, start, mid-1);
            root.right=buildTree(nums, mid+1, end);
            return root;
        }
        else {
            return null;
        }
    }
}
