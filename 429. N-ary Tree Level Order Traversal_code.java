class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         Queue<TreeNode> q = new LinkedList<>();
         List<List<Integer>> list = new ArrayList<>();
         if(root==null)return list ; 
         q.offer(root);
         while(!q.isEmpty()){
            
            int size = q.size();
            List<Integer> sublist = new ArrayList<>();
              for(int i =0 ; i <size;i++){
                   
                 TreeNode node = q.poll();
                 if(node.left!=null)q.offer(node.left);
                 if(node.right!=null)q.offer(node.right) ;
                 
                  sublist.add(node.val);
             
              }
            
             list.add(sublist) ; 
        }
        Collections.reverse(list);
        return list ; 
    }
}
