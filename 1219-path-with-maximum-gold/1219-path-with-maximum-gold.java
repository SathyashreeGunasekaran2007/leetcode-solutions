class Solution {
    public int getMaximumGold(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxgold = 0;
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                if(grid[row][col] > 0){
                    maxgold = Math.max(maxgold,backtrack(grid,row,col));
                }
            }
        } 
        return maxgold;
    }
    public int backtrack(int[][] grid, int row, int col){
        if(row<0 || col <0 || row >= grid.length || col >= grid[0].length){
            return 0;
        }
        if(grid[row][col] == 0){
            return 0;
        }
        int currentGold = grid[row][col];
        grid[row][col] = 0;
        int up = backtrack(grid,row-1,col);
        int down = backtrack(grid,row+1,col);
        int left = backtrack(grid,row,col-1);
        int right = backtrack(grid,row,col+1);
        //Undo
        grid[row][col] = currentGold;
        return currentGold + Math.max(Math.max(up,down), Math.max(left,right));
    }
}