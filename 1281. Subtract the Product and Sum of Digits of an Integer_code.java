class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum=0;
        int prod=1;
        
        while(n>0)
        {
            int rem=n%10;
            n=n/10;
            
            prod *=rem;
            sum +=rem;
            
            
        }
        
        return (prod-sum);
    }
}
