class Solution {
    public boolean isPalindrome(int x) {
        int y=x;
        int i,sum=0,rem;
        while(y!=0  && y>0)
        {   
            
            rem=y%10;
            
            sum=sum*10+rem;
            y=y/10;
        }
        
        if(x==sum)
            return true;
        else
             return false;
        
        
    }
}
