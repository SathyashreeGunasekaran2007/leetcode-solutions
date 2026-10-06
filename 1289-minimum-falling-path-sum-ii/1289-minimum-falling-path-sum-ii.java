class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];
        for (int j = 0; j < n; j++) {
            dp[n - 1][j] = matrix[n - 1][j];
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        min = Math.min(min, dp[i + 1][k]);
                    }
                }
                dp[i][j] = matrix[i][j] + min;
            }
        }
        int answer = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            answer = Math.min(answer, dp[0][j]);
        }
        return answer;
    }
}
