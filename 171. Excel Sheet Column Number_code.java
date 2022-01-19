class Solution {
    public int titleToNumber(String columnTitle) {
       
            
            int result=0;
            int flag=0;
            
            for(int i=columnTitle.length()-1;i>=0;i--)
            {
            
               char ch=columnTitle.charAt(i);
            
               int value=(int) ch-65+1;
                
                result+=value*Math.pow(26,flag);
                    flag++;
            
            }
            return result;
        
    }
    
}
