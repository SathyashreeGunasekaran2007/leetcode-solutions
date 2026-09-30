class Solution {
    public int rob(int[] nums) {
        int robber1 = 0;
        int robber2 = 0;
        for(int i : nums){
            int money = Math.max(robber1+i,robber2);
            robber1 = robber2;
            robber2 = money;
        }
        return robber2;
    }
}