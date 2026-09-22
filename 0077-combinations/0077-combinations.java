class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(1,n,k,result,current);
        return result;
    }
    public void backtrack(int start, int n, int k,List<List<Integer>> result, List<Integer> current){
        //BaseCase
        if(current.size() == k){
            result.add(new ArrayList<>(current));
        }
        //Choice
        for(int i = start; i <= n; i++){
            current.add(i);
            backtrack(i+1,n,k,result,current);
            //Undo
            current.remove(current.size() - 1);
        }
    }
}