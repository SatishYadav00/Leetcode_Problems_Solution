class Solution {
    public int numberOfSubstrings(String s) {
        
            int n=s.length();
            char[] C= s.toCharArray();
            
            int []count={0,0,0};
            
            int i=0,j=0,ans=0,res=0;
            
            for(i=0;i<n;i++)
            {
                    
                count[C[i]-'a']++;   
                    
                    
                while(j<n && count[0]>0 && count[1] > 0 && count[2] >0)
                {
                    ans++;
		    count[C[j]-'a']--;
		    j++;    
                        
                }
                    
                    res +=ans;        
            }
            return res;      
    }
}
