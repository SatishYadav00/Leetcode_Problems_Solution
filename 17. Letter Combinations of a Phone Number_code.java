class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
            if(digits.length()==0)
                    return result;
           
            
            HashMap<Character,String> h=new HashMap<>();
             h.put('2',"abc");
             h.put('3',"def");
             h.put('4',"ghi");
             h.put('5',"jkl");
             h.put('6',"mno");
             h.put('7',"pqrs");
             h.put('8',"tuv");
             h.put('9',"wxyz");
            
            
            backtrack(digits,0,h,new StringBuilder(),result);
            return result;
             
    }
        
        private static void backtrack(String digits,int i , HashMap<Character,String> h,StringBuilder s,List<String> result)
        {
             if(i==digits.length()){
                     result.add(s.toString());
                     return;
             } 
                String curr=h.get(digits.charAt(i));
                for(int k=0;k<curr.length();k++){
                        s.append(curr.charAt(k));
                         backtrack(digits,i+1,h,s,result);
                        s.deleteCharAt(s.length()-1);
                        
                }
        }
}
