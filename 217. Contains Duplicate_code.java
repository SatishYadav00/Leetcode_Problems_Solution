lass Solution {
    public boolean containsDuplicate(int[] nums) {
            
            Set<Integer>diff=new HashSet<>(nums.length);
           
            
            
            for(int i:nums){
                    if(diff.contains(i)){
                            return true;
                    }
                    diff.add(i);
            }
                    
            return false;
        
    }
}
