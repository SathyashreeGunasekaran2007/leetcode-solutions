class Solution {
    int rows;
    int cols;
    int count = 0;
    public int uniquePathsIII(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;
        int startRow = 0;
        int startCol = 0;
        int remaining = 0;
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                if(grid[row][col] != -1){
                    remaining++;
                }
                if(grid[row][col] == 1){
                    startRow = row;
                    startCol = col;
                }
            }
        }
        backtrack(grid,startRow,startCol,remaining);
        return count;
    }
    public void backtrack(int[][] grid, int row, int col, int remaining){
        if(row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == -1){
            return;
        }
        if(grid[row][col] == 2){
            if(remaining == 1){
                count++;
            }
            return;
        }
        int current = grid[row][col];
        grid[row][col] = -1;
        backtrack(grid,row-1,col,remaining-1);
        backtrack(grid,row+1,col,remaining-1);
        backtrack(grid,row,col-1,remaining-1);
        backtrack(grid,row,col+1,remaining-1);
        grid[row][col] = current;
    }
}