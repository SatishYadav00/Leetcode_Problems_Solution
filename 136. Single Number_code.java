class Solution {
    public int singleNumber(int[] nums) {
        int i=0;
            int j=0;
            while(j<nums.length){
                    i=nums[j]^i;
                   j++;
                    
            }
            return i;
    }
}
