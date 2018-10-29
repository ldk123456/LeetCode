/**
 * 从前序与中序遍历序列构造二叉树
 */
public class LeetCode105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0 || inorder.length==0){
            return null;
        }
        TreeNode result=new TreeNode(preorder[0]);
        if (preorder.length==1)
            return result;
        int index=0;
        for(index=0;index<inorder.length;index++){
            if(inorder[index]==preorder[0]){
                break;
            }
        }
        int[] left_preorder=new int[index];
        int[] left_inorder=new int[index];
        int[] right_preorder=new int[preorder.length-index-1];
        int[] right_inorder=new int[preorder.length-index-1];
        for(int i=0;i<index;i++){
            left_preorder[i]=preorder[i+1];
            left_inorder[i]=inorder[i];
        }
        result.left=buildTree(left_preorder,left_inorder);
        for(int i=0;i<preorder.length-index-1;i++){
            right_preorder[i]=preorder[i+index+1];
            right_inorder[i]=inorder[i+index+1];
        }
        result.right=buildTree(right_preorder,right_inorder);
        return result;
    }
}
