class Solution {
     int result=0;
        int islands=0;
         boolean corr=false;
    public int numEnclaves(int[][] grid) {
       
           for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    islands = 0;
                    corr = false;
                    dfs(i, j, grid);
                    if(!(i == 0 || i == grid.length-1 || j == 0 || j == grid[0].length-1) && !corr)
                    {
                        if(islands>0) result+=islands;                    
                    }
                }
            }
        }
        return result;
        
    }
    
      public void dfs(int row, int col, int[][] grid) {
        if(row >= 0 && col >= 0 && row < grid.length && col < grid[0].length && grid[row][col] == 1) {
            if(row == 0 || col == 0 || row == grid.length-1 || col == grid[0].length-1){
                corr = true;
            }
            grid[row][col] = 2;
            dfs(row - 1, col, grid);
            dfs(row, col - 1, grid);
            dfs(row + 1, col, grid);
            dfs(row, col + 1, grid);
            islands++;
        }
    }
}
