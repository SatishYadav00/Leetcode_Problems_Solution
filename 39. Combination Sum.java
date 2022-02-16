class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>combi=new ArrayList();
            
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
                {
                        temp.add(candidates[i]);
                          combination(i,candidates,temp, target-candidates[i],combi);
                        temp.remove(temp.size()-1);
                        
                }
        }
}
