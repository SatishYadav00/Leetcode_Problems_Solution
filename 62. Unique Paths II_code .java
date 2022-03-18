class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
            int m=obstacleGrid.length;
            int n=obstacleGrid[0].length;
            
            if(obstacleGrid[0][0]==1)
            {
                    return 0;
            }
            
            int [][]result=new int[m][n];
            
            for(int i=0;i<result[0].length;i++)
            
            {
                  if(obstacleGrid[0][i]==0)  
                  { result[0][i]=1;
                  }
                    else
                    {
                            break;
                    }
                         
            }
            for(int i=0;i<result.length;i++)
            
            {
                  if(obstacleGrid[i][0]==0)  
                  { result[i][0]=1;
                  }
                    else
                    {
                            break;
                    }
                         
            }
            
            for(int i=1;i<result.length;i++){
                    for(int j=1;j<result[0].length;j++)
                    {
                            if(obstacleGrid[i][j]==1)
                            {
                                    result[i][j]=0;
                            }
                            else
                            {
                               result[i][j]=result[i-1][j]+result[i][j-1];    
                            }
                    }
            }
            return result[m-1][n-1];
    }
}
