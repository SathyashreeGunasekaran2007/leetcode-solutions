class Solution {
    public int jump(int[] nums) {
        int start = 0;
        int currentEnd = 0;
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            start = Math.max(start,i+nums[i]);
            if(i == currentEnd){
                count++;
                currentEnd = start;
            }
        }
        return count;
    }
}