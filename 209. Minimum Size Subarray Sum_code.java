
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
            
            
            int left=0;
            int sums=0;
            int mini=Integer.MAX_VALUE;
            
            for(int i=0;i<nums.length;i++)
            {
                    
                    sums+=nums[i];
                    
                    while(sums >=target)
                    {
                            mini=Math.min(i-left+1,mini);
                            sums-=nums[left++];
                            
                            if(mini==1)
                            return 1;
                    }
             }
            return mini==Integer.MAX_VALUE? 0 : mini;
    }
}
