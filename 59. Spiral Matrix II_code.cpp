class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
             vector<vector<int> > mat(n, vector<int>(n));
            int num=1;
             int l,r,t,b,k;
            
            l=0;
            r=n-1;
            t=0;
            b=n-1;
            k=0;  //direction
            
              while(l<=r && t<=b)
            {
                    if(k==0)
                    {
                           for(int i=l;i<=r;i++)
                           {
                                   mat[t][i]=num;
                                   num++;
                           }
                            k=1;t++;
                    }
                    
                   else if(k==1)
                    {
                           for(int i=t;i<=b;i++)
                           {
                                    mat[i][r]=num;
                                   num++;
                           }
                            k=2;r--;
                    }
                    else if(k==2)
                    {
                           for(int i=r;i>=l;i--)
                           {
                                   mat[b][i]=num;
                                   num++;
                           }
                            k=3;b--;
                    }
                     else if(k==3)
                    {
                           for(int i=b;i>=t;i--)
                           {
                                 mat[i][l]=num;
                                   num++;
                           }
                            k=0;l++;
                    }
            }
            return mat;
    }
};
