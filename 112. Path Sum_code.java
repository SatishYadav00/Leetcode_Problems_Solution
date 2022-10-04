class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
    return helper(root,targetSum,0);
    
}

public boolean helper(TreeNode root,int tar,int cur){
    
   
    if(root==null) return false;       
    
    if(root.left==null && root.right==null){
        if(cur+root.val==tar) return true;      
        else return false  ;
    }
    
    boolean left=helper(root.left,tar,cur+root.val);        
    boolean right=helper(root.right,tar,cur+root.val);      
    
    return left || right;       
}}
