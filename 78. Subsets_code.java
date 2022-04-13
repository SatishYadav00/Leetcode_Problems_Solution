class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
            generatesubset(0,nums,new ArrayList(),res);
            return res;
    }
        
        void generatesubset(int n,int []nums,List<Integer>curr,List<List<Integer>>res)
        {
                res.add(new ArrayList(curr));
                for(int i=n;i<nums.length;i++)
                {
                        curr.add(nums[i]);
                        generatesubset(i+1,nums,curr,res);
                        curr.remove(curr.size()-1);
                        
                }
        }
}
