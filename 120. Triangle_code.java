class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
         if (triangle == null || triangle.size() == 0) {
            return 0;
        }

        int len = triangle.size();
        int[][] dp = new int[len][len];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < len; i++) {
            dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
            dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
            for (int j = 1; j < i; j++) {
                dp[i][j] = Math.min(dp[i - 1][j - 1] + triangle.get(i).get(j), dp[i - 1][j] + triangle.get(i).get(j));
            }
        }

        int min = dp[len - 1][0];
        for (int i = 1; i < len; i++) {
            min = Math.min(min, dp[len - 1][i]);
        }

        return min;
    }
}
