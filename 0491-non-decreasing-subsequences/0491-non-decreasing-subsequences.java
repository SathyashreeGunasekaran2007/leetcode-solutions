class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),result);
        return result;
    }
    public void backtrack(int[] nums, int start, List<Integer> current,List<List<Integer>> result){
        if(current.size() >= 2){
            result.add(new ArrayList<>(current));
        }
        HashSet<Integer> used = new HashSet<>();
        for(int i = start; i < nums.length; i++){
            if(used.contains(nums[i])){
                continue;
            }
            if(!current.isEmpty() && nums[i] < current.get(current.size() - 1)){
                continue;
            }
            current.add(nums[i]);
            used.add(nums[i]);
            backtrack(nums,i+1,current,result);
            current.remove(current.size()-1);
        }
    }
}