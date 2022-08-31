class Solution {
    
    int dir[][]={{0,1},{0,-1},{1,0},{-1,0}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        List<List<Integer>> res=new ArrayList<>();
        if(heights==null || heights.length==0 || heights[0].length==0)
            return res;
        
        int r=heights.length;
        int c=heights[0].length;
        boolean paci[][]=new boolean[r][c];
        boolean atli[][]=new boolean[r][c];
        
        
        for(int i=0;i<c;i++)
        {
            dfs(heights,0,i,Integer.MIN_VALUE,paci);
             dfs(heights,r-1,i,Integer.MIN_VALUE,atli);
        }
         for(int i=0;i<r;i++)
        {
            dfs(heights,i,0,Integer.MIN_VALUE,paci);
              dfs(heights,i,c-1,Integer.MIN_VALUE,atli);
        }
        
        
        
        
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(paci[i][j] && atli[i][j])
                    res.add(Arrays.asList(i,j));
            }
        }
        return res;
        
    }
    
    
    public void dfs(int [][] mat,int i,int j,int prev,boolean [][] ocean)
    {
        if(i<0 || i>=ocean.length || j<0 || j>=ocean[0].length) return;
        
        if(mat[i][j] <prev || ocean[i][j]) return;
        ocean[i][j] =true;
        for(int [] d : dir){
           dfs(mat,i+d[0],j+d[1],mat[i][j],ocean);
        }
    }
}
