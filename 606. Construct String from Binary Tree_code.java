class Solution {
    StringBuilder str;
    public String tree2str(TreeNode root) {
       str=new StringBuilder();
        TreeToStr(root);
        return str.toString();
        
    }
    
    
    void TreeToStr(TreeNode root)
    {
        if(root==null)
            return ;
        
        if(root.right==null && root.left==null)
        {
            str.append(root.val);
            return;
        }
        str.append(root.val);
        str.append('(');
        TreeToStr(root.left);
        str.append(')');
        if(root.right != null)
        {
            str.append('(');
             TreeToStr(root.right);
             str.append(')');
        }
        return;
        
    }
    
}


