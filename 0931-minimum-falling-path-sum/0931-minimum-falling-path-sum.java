class Solution {
    public int minFallingPathSum(int[][] matrix) {
       int n = matrix.length;
       int[][] dp = new int[n][n];
       //Copy the last row and process from last
       for(int j = 0; j < n; j++) {
            dp[n-1][j] = matrix[n-1][j];
       }
       //Move from bottom to top
       for(int i = n - 2; i >= 0; i--){
        for(int j = 0; j < n; j++){
            int down = dp[i+1][j];
            int downRight = Integer.MAX_VALUE;
            int downLeft = Integer.MAX_VALUE;
        if(j > 0){
            downLeft = dp[i+1][j-1];
        } 
        if(j < n-1){
            downRight = dp[i+1][j+1];
        }
        dp[i][j] = matrix[i][j] + Math.min(down, Math.min(downLeft,downRight));
        }
       }
       //Find minimum in the first row
       int answer = Integer.MAX_VALUE;
       for(int j = 0; j < n; j++){
        answer = Math.min(answer,dp[0][j]);
       }
       return answer;
    }
}