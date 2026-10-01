class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1]; //from 0 it starts and goes still 11 iterations and dp[] stores the minimum amount of coins
        Arrays.fill(dp, amount + 1); //if the amount not found return -1;
        dp[0] = 0;//the array contains 0 rupees
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}