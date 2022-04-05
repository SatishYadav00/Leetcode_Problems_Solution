class Solution {
        TreeNode first=null;
        TreeNode second=null;
        TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {
                
                inorder(root);
                        int fla=first.val;
                        first.val=second.val;
                          second.val=flag;
        
    }
        
        void inorder(TreeNode root)
        {
           if(root==null)
           {
                   return ;
                   
           }
            
                inorder(root.left);
                
                
                if(first==null && prev.val>root.val)
                {
                        first=prev;
                }
                
                if(first!=null && prev.val>root.val)
                {
                        second=root;
                }
                
                prev=root;
                inorder(root.right);
                
        }
}
