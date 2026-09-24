class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        boolean[] columns = new boolean[n];
        boolean[] leftdiagonal = new boolean[2 * n - 1];
        boolean[] rightdiagonal = new boolean[2*n-1];
        backtrack(0,n,columns,leftdiagonal,rightdiagonal);
        return count;
    }
    public void backtrack(int row, int n, boolean[] columns, boolean[] leftdiagonal, boolean[] rightdiagonal){
        if(row == n){
            count++;
            return;
        }
        for(int col = 0; col < n; col++){
            int left = row - col + n - 1;
            int right = row + col;
            if(columns[col] || leftdiagonal[left] || rightdiagonal[right]){
                continue;
            }
            columns[col] = true;
            leftdiagonal[left] = true;
            rightdiagonal[right] = true;
            backtrack(row+1,n,columns,leftdiagonal,rightdiagonal);
            columns[col] = false;
            leftdiagonal[left] = false;
            rightdiagonal[right] = false;
        }
    }
}