class Solution {
public:
    int lengthOfLastWord(string s) {
            int n=s.size()-1;
            bool temp=false;
            int c=0;
            
            for(int i=n;i>=0;i--)
            {
                    if(s[i]>='a' && s[i] <='z' ||  s[i]>='A' && s[i] <='Z')
                    {
                           temp=true;
                            c++;
                            
                    }
                    else{
                            if(temp==true)
                            return c;
                    }
            }
                 return c;
           
    }
};
