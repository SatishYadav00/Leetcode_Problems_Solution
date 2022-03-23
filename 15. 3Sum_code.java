class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
            if(nums.length==0)
                    return new ArrayList<>(res);
            Arrays.sort(nums);
            for(int i=0; i<nums.length-2;i++)
            {
                    int j=i+1;
                    int k=nums.length-1;
                    while(j<k)
                    {
                            int sums=nums[j]+nums[k];
                            if(sumsnums[i])
                                    res.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                            else if(sums>-nums[i]) k--;
                            else if(sums>-nums[i]) j++;
                            
                    }
            }
            return new ArrayList<>(res);
        
    }
}
