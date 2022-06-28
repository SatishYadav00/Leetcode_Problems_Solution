class Solution {
    public int search(int[] nums, int target) {
        
        int low=0;
        int high=nums.length;
        
        while(low < high)
        {
            int  mid =low +(high-low)/2;
            
            if(nums[mid]==target)
                return mid;
            
            else if(target > nums[mid])
            {
                low =mid+1;
                
            }
            else
            {high=mid;
        }
    }
        return -1;
    }
}
