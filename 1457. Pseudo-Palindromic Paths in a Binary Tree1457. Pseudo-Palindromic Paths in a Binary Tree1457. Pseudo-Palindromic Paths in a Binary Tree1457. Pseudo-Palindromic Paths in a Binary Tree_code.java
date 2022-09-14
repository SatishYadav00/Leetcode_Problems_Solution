class Solution {
    int res = 0;
    public int pseudoPalindromicPaths (TreeNode root) {
        int[] temp = new int[10];
        palin(root, temp);
        return res;
    }
    public void palin(TreeNode root, int[] temp) {
        if (root == null) 
            return;
        temp[root.val]++;
        if (root.right == null && root.left == null) {
            int odd = 0;
            for (int t : temp) {
                if (t % 2 == 1)
                    odd++;
                if (odd > 1) {
                    temp[root.val]--;
                    return;
                }
            }
            temp[root.val]--;
            res++;
            return;
        }
            palin(root.left, temp);
            palin(root.right, temp);
        
        temp[root.val]--;
    }
}
