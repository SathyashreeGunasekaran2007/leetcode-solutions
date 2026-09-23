class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(k,n,1,new ArrayList<>(),result);
        return result;
    }
    public void backtrack(int k, int n, int start, List<Integer> current, List<List<Integer>> result){
        if(current.size() == k){
            if(n == 0){
                result.add(new ArrayList<>(current));
                return;
            }
        }
        for(int i = start; i <= 9; i++){
            if(i > n){
                break;
            }
            current.add(i);
            backtrack(k,n-i,i+1,current,result);
            current.remove(current.size()-1);
        }
    }
}