class Solution {
    public int rob(int[] nums) {
        
        if(nums.length == 0) return 0;
        int len = nums.length;
        int[] dp = new int[len+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for(int i=2; i<=len; i++){
            dp[i] = findMax(dp[i-2]+nums[i-1], dp[i-1], nums[i-1]);
        }
        return dp[len];
    }
    int findMax(int a, int b, int c){
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        
    }
}

