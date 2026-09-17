class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int i : nums){
            int size = result.size();
            for(int j = 0; j < size; j++){
                List<Integer> subset =  new ArrayList<>(result.get(j));
                subset.add(i);
                if(!result.contains(subset)){
                    result.add(subset);
                }
            }
        }
        return result;
    }
}