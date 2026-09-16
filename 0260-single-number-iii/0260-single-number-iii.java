class Solution {
    public int[] singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res ^= nums[i];
        }
        int bit = res & -res;
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < nums.length; i++){
            if((nums[i] & bit) == 0){
                num1 ^= nums[i];
            }else{
                num2 ^= nums[i];
            }
        }
        return new int[]{num1,num2};
    }
}