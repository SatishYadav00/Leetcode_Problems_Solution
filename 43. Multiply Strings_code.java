class Solution {
    public String multiply(String num1, String num2) {
           int n=num1.length();
            int m=num2.length();
            
            if(n==0 || m==0 || "0".equals(num1)||"0".equals(num2))
            {
                    return "0";
            }
            
            if("1".equals(num1))
            {
                    return num2;
            }
            
            if("1".equals(num2))
            {
                    return num1;
            }
            
            int arr[]=new int[n+m];
            
            for(int i=n-1;i>=0;i--)
            {
                     for(int j=m-1;j>=0;j--)
                     {
                             int multi=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                             multi=multi+arr[i+j+1];
                             arr[i+j+1]=multi%10;
                             arr[i+j]+=multi/10;
                             
                     }
            }
            StringBuilder s=new StringBuilder();
            for(int k:arr)
            {
                    if(s.length()==0 && k==0)
                    {
                            continue;
                    }
                    s.append(k);
            }
            return s.toString();
    }
}
