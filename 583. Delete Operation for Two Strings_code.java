class Solution {
    public int minDistance(String word1, String word2) {
       int l1=word1.length();
        int l2=word2.length();
        int dp[][]=new int[l1][l2];
         for(int i = 0;i<word1.length();i++){
            for(int j = 0;j<word2.length();j++){
                dp[i][j]=-1;}}
        int length=lcs(word1,word2,l1-1,l2-1,dp);
    
        return (l1+l2)-(2*length);
        }
    
    int lcs(String word1,String word2,int l1,int l2,int dp[][])
    {
        if(l1<0 || l2<0) return 0;
        
        if(dp[l1][l2]!=-1) return dp[l1][l2];
        if(word1.charAt(l1)==word2.charAt(l2)){
            dp[l1][l2] = 1 + lcs(word1, word2, l1-1, l2-1, dp);
            return dp[l1][l2];}
        
        dp[l1][l2] = Math.max(lcs(word1, word2, l1-1, l2, dp), lcs(word1, word2, l1, l2-1, dp));
        return dp[l1][l2];
    }
}


