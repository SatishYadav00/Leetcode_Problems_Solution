class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
      int n=nums.length;
        int sum=0;
          
            for(int k=0;k<n;k++)
            {
                
                if(nums[k]%2==0)
                {
                    sum+=nums[k];
                }
            }
        int res[]=new int[n];
        int i=0;
        
         for(int query[]:queries)
        { 
             if(nums[query[1]]%2==0)
                sum-=nums[query[1]];
            nums[query[1]]+=query[0];
            if(nums[query[1]]%2==0)
                sum+=(nums[query[1]]);
            res[i++]=sum;
        }
        return res;
    }
}
