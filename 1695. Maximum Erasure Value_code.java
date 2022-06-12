class Solution {
    public int maximumUniqueSubarray(int[] nums) {
   int cursum=0;
        int max=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            cursum+=nums[i];
            if(map.containsKey(nums[i]))
                sum=Math.max(sum,map.get(nums[i]));
                
            max=Math.max(max,cursum-sum);
            map.put(nums[i],cursum);
        }
        
        return max;
    }
}
