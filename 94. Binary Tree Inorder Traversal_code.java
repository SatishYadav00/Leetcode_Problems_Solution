class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
                   return dfs(root,new ArrayList());
           
    }
        
private List<Integer> dfs(TreeNode root,List<Integer>list)
{
        if(root==null)
        {
                return list;
        }
       // list.add(root.val);
        list=dfs(root.left,list);
        list.add(root.val);
        return dfs(root.right,list);
}
        
    }
