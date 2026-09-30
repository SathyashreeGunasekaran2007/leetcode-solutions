class Solution {
    int[] dp;
    public int mincostTickets(int[] days, int[] costs) {
        dp = new int[days.length];
        Arrays.fill(dp,-1);
        return solve(0,days,costs);
    }
    public int solve(int index, int[] days, int[] costs){
        if(index >= days.length){
            return 0;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int cost1 = costs[0] + solve(index + 1,days,costs);
        int next7 = index;
        while(next7 < days.length && days[next7] < days[index] + 7){
            next7++;
        }
        int cost2 = costs[1] + solve(next7,days,costs);
        int next30 = index;
        while(next30 < days.length && days[next30] < days[index] + 30){
            next30++;
        }
        int cost3 = costs[2] + solve(next30,days,costs);
        dp[index] = Math.min(cost1,Math.min(cost2,cost3));
        return dp[index];
    }
}