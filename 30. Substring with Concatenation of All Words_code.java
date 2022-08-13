class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        int n=words.length;
        int m = words[0].length();
        
    List<Integer> result = new ArrayList<Integer>();
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    
       for(String word : words)
        map.put(word, map.getOrDefault(word, 0) + 1);

       for(int i = 0; i <= s.length() - m * words.length; i++) {
         
         if(map.containsKey(s.substring(i, i+m)) == true) {
            HashMap<String, Integer> cmap = new HashMap<String, Integer>(map);

            for(int j = 0; j < words.length; j++) {
                
                String check2 = s.substring(i + j * m, i + j * m + m);
                if(cmap.containsKey(check2) == true) {
                    if(cmap.get(check2) == 1) cmap.remove(check2);
                    else cmap.put(check2, cmap.get(check2) - 1);
                
                    if(cmap.size() == 0) result.add(i);
                }
                else break;
            }
        }  
    }
    
    return result;
    }
}
