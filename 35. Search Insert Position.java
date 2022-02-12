class Solution {
    public int searchInsert(int[] nums, int target) {
        
            int start_index=0;
            int end_index=nums.length-1;
            int middle;
        while (start_index <= end_index){
      middle = start_index + (end_index- start_index )/2;
      if (nums[middle] == target)
         return middle;
      if (nums[middle] <  target)
         start_index = middle + 1;
      else
         end_index = middle - 1;
   }
   return start_index;
}
}
