class Solution {
    public int findLength(int[] nums1, int[] nums2) {
          int m = nums1.length;
          int n = nums2.length;

       
        if (m == 0 || n == 0) {
            return 0;
        }
        
        int[] dp = new int[n + 1];
        int max = 0;

       
        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                dp[j] = nums1[i] == nums2[j] ? dp[j + 1] + 1 : 0;
                max = Math.max(max, dp[j]);
            }
        }
        return max;
    }
}
