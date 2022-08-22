class Solution {
    public boolean isPowerOfFour(int n) {
     int x=0b01010101010101010101010101010101; 
	  
        return n>0 && (n&(n-1))==0 && (n&x)>0;   
    }
}
