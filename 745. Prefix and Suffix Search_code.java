class WordFilter {
               HashMap<String,Integer> map;
    public WordFilter(String[] words) {
        map = new HashMap<>();
        
        for(int index = 0; index<words.length; index++){
            for(int i=0; i<=words[index].length(); i++){
                for(int j=0; j<=words[index].length(); j++){
                    String query = words[index].substring(0,i) + "#" + words[index].substring(j);
                    map.put(query,index);
                }
            }
        }
    }
    
    public int f(String prefix, String suffix) {
         String temp = prefix + "#" + suffix;
        return map.getOrDefault(temp,-1);
    }
}
