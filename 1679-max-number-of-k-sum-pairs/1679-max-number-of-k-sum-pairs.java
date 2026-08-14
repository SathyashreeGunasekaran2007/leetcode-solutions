import java.util.Arrays;
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);        
        int count = 0;
        int left = 0;
        int right = nums.length - 1;
        int sum = 0;
        while(left < right){
            sum = nums[left] + nums[right];
            if(sum == k){
                count++;
                left++;
                right--;
            }else if(sum < k){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
}