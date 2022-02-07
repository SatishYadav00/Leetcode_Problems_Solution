class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        
            vector<int> mat;
            int row=matrix.size();
            if(row==0){
                    return mat;
            }
            int col=matrix[0].size();
            
            int l,r,t,b,k;
            
            l=0;
            r=col-1;
            t=0;
            b=row-1;
            k=0;  //direction
            
            while(l<=r && t<=b)
            {
                    if(k==0)
                    {
                           for(int i=l;i<=r;i++)
                           {
                                   mat.push_back(matrix[t][i]);
                           }
                            k=1;t++;
                    }
                    
                   else if(k==1)
                    {
                           for(int i=t;i<=b;i++)
                           {
                                   mat.push_back(matrix[i][r]);
                           }
                            k=2;r--;
                    }
                    else if(k==2)
                    {
                           for(int i=r;i>=l;i--)
                           {
                                   mat.push_back(matrix[b][i]);
                           }
                            k=3;b--;
                    }
                     else if(k==3)
                    {
                           for(int i=b;i>=t;i--)
                           {
                                   mat.push_back(matrix[i][l]);
                           }
                            k=0;l++;
                    }
            }
            return mat;
    }
};
