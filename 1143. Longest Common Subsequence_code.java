class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length();
        int l2=text2.length();
        
        int dp[][]=new int [l1][l2];
            for(int i=0;i<l1;i++)
            {
                for(int j=0;j<l2;j++)
                {
                    dp[i][j]=-1;
                }
            }
        int length=lcs(text1,text2,l1-1,l2-1,dp);
        return length;
    }
    
    int lcs(String t1,String t2,int l1,int l2,int [][]dp)
    {
        if(l1<0 || l2<0) return 0;
        if(dp[l1][l2] != -1) return dp[l1][l2];
        
        if(t1.charAt(l1)==t2.charAt(l2)){
            dp[l1][l2]=1+lcs(t1,t2,l1-1,l2-1,dp);
            return dp[l1][l2];
        }
        else
        {
            dp[l1][l2]=Math.max(lcs(t1,t2,l1-1,l2,dp),lcs(t1,t2,l1,l2-1,dp));
              return dp[l1][l2];
        }
    }
}
