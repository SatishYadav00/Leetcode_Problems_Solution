class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int ans=0;
        Map<Character, String> res = new HashMap<>();
        res.put('a', ".-");
        res.put('b', "-...");
        res.put('c', "-.-.");
        res.put('d', "-..");
        res.put('e', ".");
        res.put('f', "..-.");
        res.put('g', "--.");
        res.put('h', "....");
        res.put('i', "..");
        res.put('j', ".---");
        res.put('k', "-.-");
        res.put('l', ".-..");
        res.put('m', "--");
        res.put('n', "-.");
        res.put('o', "---");
        res.put('p', ".--.");
        res.put('q', "--.-");
        res.put('r', ".-.");
        res.put('s', "...");
        res.put('t', "-");
        res.put('u', "..-");
        res.put('v', "...-");
        res.put('w', ".--");
        res.put('x', "-..-");
        res.put('y', "-.--");
        res.put('z', "--..");
        
        Set<String> set = new HashSet<>();
      
        for(String word : words){
            String str = "";
            for(char ch : word.toCharArray()){
                str = str + res.get(ch);
            }
            if(!set.contains(str)){
                set.add(str);
                ans++;
            }
        }
        
        return ans;
    }
}
