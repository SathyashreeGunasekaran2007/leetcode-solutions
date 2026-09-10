class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = 0;
        for(int i = 0; i < nums.length; i++){
            right = Math.max(right,nums[i]);
        }
        while(left <= right){
            int mid = left + (right - left)/2;
            long operation = 0;
            for(int i = 0; i < nums.length; i++){
                operation += (nums[i] - 1)/mid;
            }
            if(operation <= maxOperations){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        } 
        return left;  
    }
}