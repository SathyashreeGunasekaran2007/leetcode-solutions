class Solution {
    int[] dp;
    public int numSquares(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solve(n);
    }
    public int solve(int n) {
        if (n == 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            int remaining = n - square;
            int count = solve(remaining);
            min = Math.min(min, count + 1);
        }
        dp[n] = min;
        return min;
    }
}