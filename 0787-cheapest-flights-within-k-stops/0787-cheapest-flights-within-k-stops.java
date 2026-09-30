class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dp = new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[src] = 0;
        for(int i = 0; i <= k; i++){ //there can be k + 1 stops because the last stop may be the destination
            int[] temp = dp.clone();
            for(int[] flight : flights){
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];
                if(dp[from] != Integer.MAX_VALUE){
                    temp[to] = Math.min(temp[to],dp[from]+price);
                }
            }
            dp = temp;
        }
        return dp[dst] == Integer.MAX_VALUE ? -1 : dp[dst];
    }
}