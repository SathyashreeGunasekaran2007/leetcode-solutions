class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] chessboard = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(chessboard[i],'.');
        }
        boolean[] columns = new boolean[n];//keep the rows as static and iterate over the columns to check where to place
        boolean[] leftdiagonal = new boolean[2*n-1];
        boolean[] rightdiagonal = new boolean[2*n-1];
        backtrack(0,n,chessboard,result,columns,leftdiagonal,rightdiagonal);
        return result;
    }
    public void backtrack(int row, int n,char[][] chessboard,List<List<String>> result, boolean[] columns, boolean[] leftdiagonal, boolean[] rightdiagonal){
        //Base Case
        if(row == n){
            List<String> currboard = new ArrayList<>();
            for(int i = 0; i < n; i++){
                currboard.add(new String(chessboard[i]));//because answer is given in the string
            }
            result.add(currboard);
            return;
        }
        //Choice case
        for(int col = 0; col < n; col++){//for column iterating
            int rightdig = row - col + n - 1;
            int leftdig = row + col;
            if(columns[col] || leftdiagonal[leftdig] || rightdiagonal[rightdig]){
                continue;
            }
            chessboard[row][col] = 'Q';
            columns[col] = true;
            leftdiagonal[leftdig] = true;
            rightdiagonal[rightdig] = true;
            backtrack(row+1, n, chessboard, result, columns, leftdiagonal, rightdiagonal);
            //Undo
            chessboard[row][col] = '.';
            columns[col] = false;
            leftdiagonal[leftdig] = false;
            rightdiagonal[rightdig] = false;
        }
    }
}