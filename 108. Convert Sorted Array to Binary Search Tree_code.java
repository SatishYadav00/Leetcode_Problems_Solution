class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums,0,nums.length-1);
        
    }
    
    TreeNode bst(int []nums ,int i,int j)
    {
        if(i>j)
            return null;
        
        int mid=(j+i)/2;
        
        TreeNode node=new TreeNode(nums[mid]);
        
        node.left= bst(nums,i,mid-1);
        node.right= bst(nums,mid+1,j);
        
        return node;
    }
}
