class Solution {
    public int concatenatedBinary(int n) {
     
        long ans=0;
        int count=0;
        
        int i=1;
        while(i<=n)
        {
            if((i&(i-1))  == 0)
                count++;
            ans=((ans<<count) | i)%1000000007;
          i++;
        }
        return (int)ans;
    }
    
}
