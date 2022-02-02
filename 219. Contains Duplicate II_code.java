class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
            HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
            
            for(int i=0;i<nums.length;i++)
            {
                    int temp=nums[i];
                    if(map.containsKey(temp) && i-map.get(temp)<=k)
                    {
                            return true;
                    }
                   else
                   {
                           map.put(temp,i);
                   }
            }
            return false;
    }
}
