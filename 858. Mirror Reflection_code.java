// ex=number of room extension + 1
// rf=number of reflection + 1 

class Solution {
    public int mirrorReflection(int p, int q) {
        int ex=q;
        int rf=p;
        
        while(ex % 2==0 && rf %2==0)
        {
            ex /=2;
            rf /=2;
        }
         if(ex %2==0 && rf %2 !=0 ) return 0;
        if(ex %2 !=0 && rf %2  ==0 ) return 2;
        if(ex %2 !=0 && rf %2 !=0 ) return 1;
        
        return -1;
        
     
    }
}
