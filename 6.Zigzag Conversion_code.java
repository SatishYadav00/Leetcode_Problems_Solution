class Solution {
    public String convert(String s, int numRows) {
        if(numRows ==1){
            
        System.out.print(s);
            return s;
            
        }
        char[] str1=s.toCharArray();
        int len=s.length();
        char[] ar=new char[numRows];
  
        
        int row=0;
        boolean down =true;
        for(int i=0;i<numRows;i++){
            ar[row] +=(str1[i]);
            
                
                if(row==numRows-1){
                    down =false;
                
                }
            else if(row==0){
                down=true;
            }
            if(down){
                row++;
            }
                            else{
                                row--;
                            }
            
                            }
    
        return new String(ar);
        
    }
}
