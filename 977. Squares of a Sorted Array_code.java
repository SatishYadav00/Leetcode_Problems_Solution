class Solution {
    public int[] sortedSquares(int[] nums) {
            int n=nums.length;
            int[] res=new int[n];
            int low=0;
            int high=n-1;
            int i= n-1;
            
           while(i>=0)
           {
                   if(nums[low]*nums[low]> nums[high]*nums[high]){
                           res[i--]=nums[low]*nums[low];
                           low++;
                   }
                   else
                   {    res[i--]=nums[high]*nums[high];
                              high--;
                   }
           }
            
            
            
            return res;
        
    }
}
