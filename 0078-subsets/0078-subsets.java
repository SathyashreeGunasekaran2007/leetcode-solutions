class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); //first create the empty array
        for(int i : nums){
            int size = result.size();
            for(int j = 0; j < size; j++){
                List<Integer> subset = new ArrayList<>(result.get(j));//gets the empty array which is added to the result
                subset.add(i);//gets the array values one by one
                result.add(subset);
            }
        }
        return result;
    }
}