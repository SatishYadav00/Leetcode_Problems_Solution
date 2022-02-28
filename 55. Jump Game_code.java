class Solution {
    public boolean canJump(int[] nums) {
            int maximum=0;
            
            for(int i=0;i<nums.length;i++)
            {
                    if(maximum<i)
                            
                    {
                            return false;
                    }
                    
                    maximum=Math.max(maximum,i+nums[i]);
                    
            }
            return true;
        
    }
}
