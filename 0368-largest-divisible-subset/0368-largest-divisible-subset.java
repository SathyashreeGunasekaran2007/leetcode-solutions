class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        int[] parent = new int[nums.length];
        Arrays.fill(result,1);
        Arrays.fill(parent,-1);
        int maxIndex = 0;
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j < i; j++){
                if(nums[i] % nums[j] == 0 && result[j] + 1 > result[i]){
                    result[i] = result[j]+1;
                    parent[i] = j;
                }
            }
            if(result[i] > result[maxIndex]){
                maxIndex = i;
            }
        }
        List<Integer> answer = new ArrayList<>();
        while(maxIndex != -1){
            answer.add(nums[maxIndex]);
            maxIndex = parent[maxIndex];
        }
        return answer;
    }
}