class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        Map<Integer,Integer>mp=new HashMap<Integer,Integer>();
        
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        
        TreeNode root=buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mp);
            return root;
    }
    
    public TreeNode buildTree(int [] preorder,int preStart,int preEnd,int []inorder,int inStart,int inEnd, Map<Integer,Integer>mp)
    {
        if(preStart > preEnd  || inStart > inEnd )return null;
        
        TreeNode root= new TreeNode(preorder[preStart]);
        int inRoot=mp.get(root.val);
        int numsLeft=inRoot-inStart;
        root.left=buildTree(preorder,preStart+1,preStart+numsLeft,inorder,inStart,inRoot-1,mp);
         root.right=buildTree(preorder,preStart+numsLeft+1,preEnd,inorder,inRoot+1,inEnd,mp);
        return root;
    }
}
