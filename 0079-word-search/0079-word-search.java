class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(backtrack(board,word,row,col,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean backtrack(char[][] board, String word, int row, int col, int index){
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length){
            return false;
        }
        if(board[row][col] != word.charAt(index)){
            return false;
        }
        if(index == word.length() - 1){
            return true;
        }
        char original = board[row][col];
        board[row][col] = '*';
        boolean stringFound = backtrack(board,word,row-1,col,index+1) ||
         backtrack(board,word,row+1,col,index+1) || 
         backtrack(board,word,row,col-1,index+1) || 
         backtrack(board,word,row,col+1,index+1); 
        board[row][col] = original;
        return stringFound;
    }
}