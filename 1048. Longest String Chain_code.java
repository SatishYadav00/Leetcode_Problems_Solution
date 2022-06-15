class Solution {
    public int longestStrChain(String[] words) {
         Arrays.sort(words,(a,b) ->a.length()-b.length());
        int result=0;
        Map<String,Integer> mp=new HashMap<>();
        
        for(String s:words){

        mp.put(s,1);
            for(int i=0;i<s.length();i++){
                StringBuilder temp=new StringBuilder(s);
                String next=temp.deleteCharAt(i).toString();
                if(mp.containsKey(next)){
                    mp.put(s,Math.max(mp.get(s),mp.get(next)+1));
                }
            }
            result=Math.max(result,mp.get(s));
        }
        return result;
    }
}
