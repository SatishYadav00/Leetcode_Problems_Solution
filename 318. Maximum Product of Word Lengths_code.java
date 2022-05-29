    public int maxProduct(String[] words) {
        
        int len=words.length;
        
        int state[]=new int[len];
     
        for(int i=0;i<len;i++)
        {
            state[i]=getstate(words[i]);
        }
        
        int maxi=0;
        for(int i=0;i<len;i++)
        {
          for(int j=i+1;j<len;j++)
          {
             if((state[i] &state[j])==0)
             {
                if(words[i].length() *words[j].length()>maxi)
                 maxi=words[i].length()*words[j].length();
             }
             }
              }
        return maxi;
        }
    
    
    
    int getstate(String s)
    {
      int state=0;
    for(char c:s.toCharArray()){
        int index=c-'a';
        state |=1<<(index);
    }
    return state;
    }
    }
