class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int x : nums){
            total += x;
        }
        if(total % 2 != 0){
            return false;
        }
        int target = total / 2;
        boolean[] dp = new boolean[target+1];
        dp[0] = true;
        for(int x : nums){
            for(int j = target; j >= x; j--){
                dp[j] = dp[j] || dp[j-x];
            }
        }
        return dp[target];
    }
}