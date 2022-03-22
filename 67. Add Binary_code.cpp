class Solution {
public:
    string addBinary(string a, string b) {
        
            int sum=0;
            string result="";
            int p=a.size()-1;
             int q=b.size()-1;
            
            while(p>=0 || q>=0 || sum==1)
            {
                    sum +=((p>=0)? a[p]-'0':0);
                    sum +=((q>=0)? b[q]-'0':0);
                    result=char(sum % 2+'0')+result;
                    sum/=2;
                    p--;
                    q--;
                    
            }
            return result;
            
    }
};
