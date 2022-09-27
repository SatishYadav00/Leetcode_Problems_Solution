class Solution {
    public String pushDominoes(String dominoes) {   
        
        
    int n=dominoes.length();
        int []Left=new int[n];
        int NLI=-1;
        for(int i=n-1;i>=0;i--)
        {
            char c=dominoes.charAt(i);
            if(c=='L')
            {
                NLI=i;
            }
            else if(c=='R'){
                NLI=-1;
        }
        Left[i]=NLI;
    }
    
    
          int [] Right=new int[n];
        int NRI=-1;
        for(int i=0;i<n;i++)
        {
            char c=dominoes.charAt(i);
            if(c=='L')
            {
                NRI=-1;
            }
            else if(c=='R'){
                NRI=i;
        }
        Right[i]=NRI;
    }
        
        
        
        char[] ans=new char[n];
        
        for(int i=0;i<n;i++)
        {
            if(dominoes.charAt(i)=='.')
            {
                int nearestLeft=Left[i];
                int nearestRight=Right[i];
                
                int leftDiff=nearestLeft==-1 ?Integer.MAX_VALUE:Math.abs(nearestLeft-i);
                
                  
                int rightDiff=nearestRight==-1 ?Integer.MAX_VALUE:Math.abs(nearestRight-i);
                
                if(leftDiff==rightDiff)
                {
                    ans[i]='.';
                }
                else if(leftDiff>rightDiff)
                {
                    ans[i]='R';
                }
                else if(leftDiff<rightDiff)
                {
                    ans[i]='L';
                }
            }
                else
                {
                    ans[i]=dominoes.charAt(i);
                }
            }
        return new String(ans);
        }
        
        
    }
    
