class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>combi=new ArrayList();
            Arrays.sort(candidates);
            
            combination(0,candidates,new  ArrayList(), target,combi);
            return combi;
            
            
    }
        
         void combination(int j,int[]candidates,List<Integer> temp, int target,List<List<Integer>>combi)
        {
                if(target==0)
                {
                        combi.add(new ArrayList(temp));
                }
                if(target<0)
                {
                        return;
                }
                
                for(int i=j;i<candidates.length;i++)
                {       if(i>j && candidates[i]==candidates[i-1])
                        continue;
                        temp.add(candidates[i]);
                          combination(i+1,candidates,temp, target-candidates[i],combi);
                        temp.remove(temp.size()-1);
                        
                }
        }
}
