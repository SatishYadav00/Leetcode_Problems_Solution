class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
            if(grid[0][0]==1)
            return -1;
        int m=grid.length,n=grid[0].length,c=0;
        Queue<int[]> nm=new LinkedList<>();
        nm.offer(new int[] {0,0,1});
        int d[][]={{1,1},{-1,-1},{1,0},{-1,0},{0,1},{0,-1},{1,-1},{-1,1}};
        while(!(nm.isEmpty()))
        {
            int l=nm.size();
            while(l-->0)
            {
                int f[]=nm.poll();
                if(f[0]==m-1&&f[1]==n-1)
                    return f[2];
                for(int k[]: d)
                {
                    int i=f[0]+k[0];
                    int j=f[1]+k[1];
                    if(i>=0&&j>=0&&i<m&&j<n&&grid[i][j]==0)
                    {
                        nm.offer(new int[] {i,j,f[2]+1});
                        grid[i][j]=1;
                    }
                }
            }
        }
        return -1;
    }
}
