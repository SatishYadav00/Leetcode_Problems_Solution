class Solution {
    public boolean validPalindrome(String s) {
        boolean result=check(s,0,s.length()-1,false);
            return result;
    }
        public boolean check(String s,int l,int h,boolean remove)
        {
                
                while(l <= h){
                if(s.charAt(l) == s.charAt(h))
                {
                        l++;
                        h--;
                }
                else
                {
                        if(remove)
                        {
                                return false;
                        }
                        return check(s,l+1,h,true) || check(s,l,h-1,true);
                        
                }
                
        }
        return true;
}
}
