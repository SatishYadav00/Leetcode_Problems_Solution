class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result=new ArrayList<String>();
        
        for(String w:words){
        if(Equal(w,pattern))
           result.add(w);
           }
        
        return result;
        
    }
           
           boolean Equal(String word ,String pattern)
           {
               char[] PattToword=new char[26];
               char[] wordToPatt=new char[26];
               
               for(int i=0;i<pattern.length();i++)
               {
                 char wc=word.charAt(i);
                   char pc=pattern.charAt(i);
                   
                   if(PattToword[pc-'a']==0)
                   {
                       PattToword[pc-'a']=wc;
                   }
                     if(wordToPatt[wc-'a']==0)
                   {
                       wordToPatt[wc-'a']=pc;
                   }
                   if(wordToPatt[wc-'a'] != pc ||  PattToword[pc-'a'] != wc)
                       return false;
                   
                   
               }
               return true;
           }
}
