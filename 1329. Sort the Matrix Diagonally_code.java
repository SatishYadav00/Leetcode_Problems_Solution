class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        
        
   for(int i=0;i<col;i++)
   {
       sort(mat,0,i,row,col);
   }
    for(int j=1;j<row;j++)
   {
       sort(mat,j,0,row,col);
   }
   
        
        return mat;
    }
    
   void sort(int [][] mat,int row ,int col,int m,int n)
    {
        List<Integer>values=new ArrayList<>();
        
        int r=row,c=col;
        
        while(r<m && c<n){
            values.add(mat[r][c]);
            r++;
            c++;
        }
        Collections.sort(values);
        
        r=row;
        c=col;
        int index=0;
        while(r<m && c<n)
        {
            mat[r][c]=values.get(index++);
            r++;
            c++;
        }
    }
}
