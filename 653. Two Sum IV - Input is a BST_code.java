class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return false;
        stack.push(root);
        while(!stack.isEmpty() || root != null){
            while(root != null){
                stack.push(root);
                if((k - root.val) != root.val){
                    map.put(root.val,k - root.val);
                }
                if(map.containsKey(k - root.val)) return true;
                root = root.left;
            }
            TreeNode node = stack.pop();
            root = node.right;
        }
        return false;
    }
}
