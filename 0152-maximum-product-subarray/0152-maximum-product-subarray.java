class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int max = nums[0];
        for(int i = 0; i < n; i++){
            //if any of leftProduct or rightProduct become 0 then replace it with 1
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;
            leftProduct *= nums[i]; // start the left product from 0
            rightProduct *= nums[n-1-i]; // start the right product from end of the nums array
            max = Math.max(max,Math.max(leftProduct,rightProduct));
        }
        return max;
    }
}