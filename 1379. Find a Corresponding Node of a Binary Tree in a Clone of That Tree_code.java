  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 

class Solution {
        TreeNode target,result;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        
            this.target=target;
            inorder(original,cloned);
            return result;
    }
        
        public void inorder(TreeNode ori,TreeNode clone)
        {
                if(ori != null)
                {
                inorder(ori.left,clone.left);
                if(ori==target) result=clone;
                inorder(ori.right,clone.right);
        }}
}
