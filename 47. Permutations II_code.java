class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
            List<List<Integer>> result=new ArrayList<>();
            boolean [] visited=new boolean[nums.length];
            Arrays.sort(nums);
            
            Backtrack(result,nums,new ArrayList(),visited);
            return result;
    }
        
        void  Backtrack(List<List<Integer>> result,int[] nums,List<Integer> current,boolean visited[])
        
        {
                if(current.size()==nums.length)
                {
                  result.add(new ArrayList<>(current));
                        return ;
                   
                }
                else{
                
                
                for(int i=0;i<nums.length;i++)
                {
                        if(visited[i]==true) 
                        {continue; }
                        
                        if(i> 0 && nums[i]==nums[i-1] && !visited[i-1])
                        {
                                continue;
                        }
                        current.add(nums[i]);
                        visited[i]=true;
                        Backtrack(result,nums,current,visited);
                        visited[i]=false;
                        current.remove(current.size()-1);
                                      
                }
                }
        }
}
