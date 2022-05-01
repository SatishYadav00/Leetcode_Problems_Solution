class Solution {
    public void rotate(int[] nums, int k) {
        
            int n=nums.length;
            k=k%n;
            reverse(nums,0,n-k-1); //it will swap the value from  index  0 to 3   4 3 2 1 5 6 7
            reverse(nums,n-k,n-1);////it will swap the value from  4 to 6  4 3 2  1 7 6 5
            reverse(nums,0,n-1);//it will swap the value from  0 to 6 of the above array 5 6 7 1 2 3 4      
          
        
            
   
}
        
        void reverse(int[] nums,int low,int high)
        {
                while(low<=high){
                       int  temp=nums[low];
                        nums[low]=nums[high];
                        nums[high]=temp;
                        low++;
                        high--;
                }
                }
        }
