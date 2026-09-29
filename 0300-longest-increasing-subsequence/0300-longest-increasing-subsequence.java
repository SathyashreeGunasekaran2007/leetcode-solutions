class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result,1);
        for(int i = 1; i < nums.length; i++){
            for(int j= 0; j < i; j++){
                if(nums[i] > nums[j]){
                    result[i] = Math.max(result[i],result[j]+1);
                }
            }
        }
        int max = 0;
        for(int i = 0; i < result.length; i++){
            max = Math.max(max,result[i]);
        }
        return max;
    }
}