class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
     
        
        int row=mat.length;
        int col=mat[0].length;
        int rowN=0;
        int colN=0;
        
        int arr[][]=new int[r][c];
        
        if(r*c != row*col)
            return mat;
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[rowN][colN]=mat[i][j];
                    colN++;
                if(colN==c)
                {
                    rowN++;
                    colN=0;
                }
            }
        }
        return arr;
        
        
    }
}
