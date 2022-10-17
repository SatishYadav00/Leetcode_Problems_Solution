 class Solution{
   public boolean checkIfPangram(String sentence) {
     
     HashSet<Character>set=new HashSet<>();
     
     for(int i=0;i<sentence.length();i++)
     {
       char ch=sentence.charAt(i);
       set.add(ch);
     }
     
     if(set.size()==26)
       return true;
     
     return false;
   }
 }
