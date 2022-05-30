class Solution {
    
    public boolean canPartition(int[] nums) {
        

        int totalSum = Arrays.stream(nums).sum();
        if(totalSum % 2 == 1) return false;
        int target = totalSum / 2;        
        return findSubsetTarget(nums, target);
    }
    
    private boolean findSubsetTarget(int[] nums, int target){
        Boolean [][] memo = new Boolean[nums.length][target+1];
        return dp(0, 0, nums, target, memo);
    }
    
    private boolean dp(int index, int curSum, int[] nums, int target, Boolean [][] memo){
        if(curSum >= target){
          return curSum == target;  
        } 
        if(index >= nums.length) return false;
        if(memo[index][curSum] != null) return memo[index][curSum];
        
        boolean pick = dp(index+1, curSum + nums[index], nums, target, memo);
        boolean dontPick = dp(index+1, curSum, nums, target, memo);
        
        return memo[index][curSum] = pick || dontPick;
    }
    
}
