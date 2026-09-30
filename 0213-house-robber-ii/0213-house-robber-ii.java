class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int case1 = robRange(nums,0,nums.length-2);
        int case2 = robRange(nums,1,nums.length-1);
        return Math.max(case1,case2);
    }
    public int robRange(int[] nums, int start, int end) {
        int robber1 = 0;
        int robber2 = 0;
        for(int i = start; i <= end; i++) {
            int money = Math.max(robber1 + nums[i], robber2);
            robber1 = robber2;
            robber2 = money;
        }
        return robber2;
    }
}