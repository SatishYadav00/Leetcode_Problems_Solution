class Solution {
    public int longestOnes(int[] nums, int k) {
        
            int i=0,j=0,count=0;
            
            int mini=Integer.MIN_VALUE;
            int res=mini;
            
            for(i=0;i<nums.length;i++)
            {
                    
                    if(nums[i]==0)
                            count++;
                    
                    while(count>k && j<nums.length)
                    {
                            if(nums[j]==0)
                                    count--;
                            j++;
                    }
                    
                    res=Math.max(res,i-j+1);
                    
                    
            }
            return  res == mini ? ((count <= k) ? nums.length : 0) : res;
            
            
    }
}
