class Solution {
    public int numMatchingSubseq(String s, String[] words) {
       
        int res = 0;
        HashMap<String, Integer> map = new HashMap<>(words.length);
        for(String word: words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        
        char[] s1 = s.toCharArray();
        for(String key: map.keySet()){
            char[] temp = key.toCharArray();
            
            int i = 0;
            int j = 0;
            while(i < s1.length && j < temp.length){
                if(s1[i] == temp[j]){
                    ++j;
                }
                ++i;
             
                if(j == temp.length){
                    res += map.get(key);
                }
            }
        }
        return res;
    }
}
