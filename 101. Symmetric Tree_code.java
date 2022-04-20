class Solution {
    public boolean isSymmetric(TreeNode root) {
            return dfs(root,root);
        
    }
        
        private boolean dfs(TreeNode r1,TreeNode r2)
        {
                if(r1==null && r2==null) 
                        return true;
                if(r1==null || r2==null) 
                        return false;
                
              boolean  k= (r1.val==r2.val) && dfs(r1.left,r2.right) && dfs(r1.right,r2.left);
                return k;
        }
}
