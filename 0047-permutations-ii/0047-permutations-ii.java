class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums,result,used,current);
        return result;
    }
    public void backtrack(int[] nums, List<List<Integer>> result, boolean[] used, List<Integer> current){
        if(current.size() == nums.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]){
                continue;
            }
            if(i > 0 && nums[i] == nums[i-1] && !used[i-1]){
                continue;
            }
            current.add(nums[i]);
            used[i] = true;
            backtrack(nums,result,used,current);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }

}