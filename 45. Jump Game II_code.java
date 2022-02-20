class Solution {
    public int jump(int[] nums) {
            
          int min_jump=0 ,reach=0,max=0;
            
          int n=nums.length;
          
            for(int i=0;i<n-1;i++)
            {
                    if(i+nums[i]>max)
                    {
                          max=i+nums[i];
                           
                    }
                    if(i==reach){
                    min_jump++;
                    reach=max;}
            }
            return  min_jump;
    }
}
