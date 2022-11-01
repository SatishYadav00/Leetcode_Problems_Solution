class Solution {
    public int[] findBall(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int ans[]=new int[c];
        Arrays.fill(ans,-1);
        for(int i=0;i<c;i++)
        {
            int x=0;
            int y=i;

            while(true)
            {
                if(x>=r){
                    if(y>=0 && y<c){
                        ans[i]=y;
                    }
                    else{

                    }
                    break;
                }
                else{
                    if(y+1<c && grid[x][y]==1 && grid[x][y+1]==1)
                    {
                        x++;
                        y++;
                    }
                    else if(y-1>=0 && grid[x][y]==-1 && grid[x][y-1]==-1)
                    {
                        x++;
                        y--;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
