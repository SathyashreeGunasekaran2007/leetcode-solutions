class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int min = nums[0];
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        for(int i = min; i <= max; i++){
            boolean found = false;
            for(int num : nums){
                if(num == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                ans.add(i);
            }
        }
        return ans;
    }
}