/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> res=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        if(root==null)
            return res;
        
        dfs(root,targetSum,new LinkedList<>());
        
        return res;
    }
    
    private void dfs(TreeNode root,int target,List<Integer> path)
    {
        target-=root.val;
        path.add(root.val);
        
        if(root.right==null && root.left==null && target==0)
        {
            res.add(new LinkedList<>(path));
        }
        else
        {
            if(root.left != null)
            {
                dfs(root.left,target,path);
            }
            if(root.right != null)
            {
        dfs(root.right,target,path);
}
        }
        path.remove(path.size()-1);
        
    }
}
