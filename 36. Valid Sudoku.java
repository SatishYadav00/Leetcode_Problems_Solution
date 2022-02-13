class Solution {
    public boolean isValidSudoku(char[][] board) {
       
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.')
                    continue;
     
                if(!isValid(board, i, j))
                    return false;
            }
        }
    return true; 
    }
 
    public boolean isValid(char[][] board, int i, int j){     
        for(int x=0; x<9; x++){
            if(x != j){
                if(board[i][x]== board[i][j])
                    return false;
            }
        }
        
        for(int x=0; x<9; x++){
            if(x != i){
                if(board[x][j] == board[i][j])
                    return false;
            }
        }

        for(int a=0; a<3; a++){
            for(int b=0; b<3; b++){
                int x=i/3*3+a;
                int y=j/3*3+b;
                
                if(x != i && y != j){
                    if(board[x][y] == board[i][j])
                        return false;
                }   
            }
        }    
        return true;
    }
}
