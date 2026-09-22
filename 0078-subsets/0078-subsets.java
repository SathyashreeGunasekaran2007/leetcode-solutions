class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums,current,result,0);
        return result;
    }
    public void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result, int index){
        result.add(new ArrayList<>(current));
        for(int i = index; i < nums.length; i++){
            current.add(nums[i]);
            backtrack(nums,current,result,i+1);
            current.remove(current.size() - 1);
        }

    }
}