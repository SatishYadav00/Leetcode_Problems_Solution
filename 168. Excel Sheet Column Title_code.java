class Solution {

   public String convertToTitle(int columnNumber) {
        
            StringBuilder s=new StringBuilder();
            
            while(columnNumber>0)
            {             columnNumber--;
                    char ch= (char)(columnNumber%26+'A');
                    s.append(ch);
                    columnNumber/=26;
                    
            }
            return s.reverse().toString();
    }
};
