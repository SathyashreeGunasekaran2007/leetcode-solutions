class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int twosteps = cost[0];
        int onesteps = cost[1];
        for(int i = 2; i < cost.length; i++){
            int current = cost[i] + Math.min(twosteps,onesteps);
            twosteps = onesteps;
            onesteps = current;
        }
        return Math.min(twosteps,onesteps);
    }
}