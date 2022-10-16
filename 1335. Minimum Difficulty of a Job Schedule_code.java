class Solution {
   private int inf = 1000000;
    
    public int minDifficulty(int[] difficulties, int days) {
        int n = difficulties.length;
        if (n < days) {
            return -1;
        }
        
        int[][] dp = new int[n+1][days+1];
        
        for (int j = 1; j <= days; j++) {
            dp[n][j] = inf;
        }
        for (int i = 0; i < n; i++) {
            dp[i][0] = inf;
        }
        dp[0][0] = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 1; j <= days; j++) {
                dp[i][j] = inf;
                int curMax = 0;

                for (int k = i; k < n; k++) {
                    curMax = Math.max(curMax, difficulties[k]);
                    
                    dp[i][j] = Math.min(dp[i][j], dp[k+1][j-1] + curMax);
                }
            }
        }
        
        return dp[0][days];
        
    }
}
