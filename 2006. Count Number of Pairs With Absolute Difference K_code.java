class Solution {
    public int countKDifference(int[] nums, int k) {
        
            HashMap<Integer,Integer> hm=new HashMap<>();
            int res=0;
            
            for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
             for(int i:nums){
            if(hm.containsKey(i-k)){
                res+=hm.get(i-k);
            }
        }
        return res;
            
    }
}
