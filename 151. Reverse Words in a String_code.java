class Solution {
    public String reverseWords(String s) {
            s=s.trim();
           String [] str=s.split(" ");
           String  result="";
            
           int n=str.length-1;
            for(int i=n;i>=0;i--)
            {
                    if(str[i].isEmpty())
                    {
                      continue;
                    }
                result=result+str[i]+" ";
                    
                    
            }
            return result.trim();
            
            
    }
}
