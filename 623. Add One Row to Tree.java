
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if (root == null) {
            return root;
        }
        if (depth == 1) {
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty() || depth > 1) {
            int size = q.size();
            
            while (size > 0) {
                TreeNode node = q.poll();
                if (depth == 2) {
                    TreeNode left = new TreeNode(val);
                    left.left = node.left;
                    TreeNode right = new TreeNode(val);
                    right.right = node.right;
                    node.right = right;
                    node.left = left;
                } else {
                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }
                }
                size--;
            }
            depth--;
        }
        
        return root;
    }
}


