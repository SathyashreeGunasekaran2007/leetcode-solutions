class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            right = Math.max(right,nums[i]);
        }
        while(left <= right){
            int mid = left + (right - left) / 2;
            int ans = 0;
            for(int i = 0; i < nums.length; i++){
                ans += (int) Math.ceil((double)nums[i]/mid);
            }
            if(ans <= threshold){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
    
}