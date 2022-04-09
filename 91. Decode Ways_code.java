class Solution {
    public int numDecodings(String s) {
            if(s==null || s.charAt(0) == '0')
                    return 0;
            
            int n=s.length();
            int [] ar=new int[n+1];
            ar[0]=1;
            ar[1]=1;
            
            for(int i=2;i<=n;i++)
            {
                    int first=Integer.parseInt(s.substring(i-1,i));
                    
                    int second=Integer.parseInt(s.substring(i-2,i));
          if(first >=1 && first<=9)
          {
                  
                    ar[i] =ar[i]+ ar[i-1];
            }
                  if(second >=10 && second<=26)
          {
                  
                    ar[i] += ar[i-2];
            }    
            }
            return ar[n];
        
   }
}
