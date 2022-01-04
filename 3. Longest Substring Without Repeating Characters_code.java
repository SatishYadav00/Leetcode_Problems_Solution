class Solution {
    
        public int lengthOfLongestSubstring(String s) {
        int  max=0;
        int i=0;
        int j=0;
        
            
 HashSet<Character> hash_set = new HashSet();
            
 while (j<s.length()) {
     
    if(!hash_set.contains(s.charAt(j))){
        hash_set.add(s.charAt(j));
        j++;
        max=Math.max(hash_set.size(),max);
        
    }
     else {
         hash_set.remove(s.charAt(i));
         i++;
     }
     }
            return max;
 }}
