class Solution {
    public int longestPalindrome(String[] words) {
         HashMap<String,Integer> hm=new HashMap<>();
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            if(hm.containsKey(words[i]))
            hm.put(words[i],hm.get(words[i])+1);
            else
            hm.put(words[i],1); 
        }
        for(Map.Entry m: hm.entrySet())
        {
            String key=(String)m.getKey();
            int val=(int)m.getValue();
            String rev=reverse(key);
            if(hm.containsKey(rev))
            {
                if(rev.equals(key))
                {
                    int y=hm.get(rev);
                    if(y%2!=0)
                        y--;
                    count+=(2*y);
                    hm.replace(rev,hm.get(rev)-y);  
                }
                else
                {
                    int min=Math.min(val,hm.get(rev));
                    count+=(4*min);
                    hm.replace(key,val-min);
                    hm.replace(rev,hm.get(rev)-min);
                }
            }
            
        }
        for(Map.Entry m: hm.entrySet())
        {
            String key=(String)m.getKey();
            int val=(int)m.getValue();
            if(key.charAt(0)==key.charAt(1) && val>0)
            {
                count+=2;
                break;
            }
        }
        return count;
    }
    static String reverse(String s)
    {
        String ans="";
        for(int i=1;i>=0;i--)
            ans+=s.charAt(i);
        
        return ans;
    }
}
