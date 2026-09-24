class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        backtrack(result,current,n,0,0);
        return result;
    }
    public void backtrack(List<String> result, StringBuilder current, int n, int open, int close){
        if(current.length() == 2 * n){
            result.add(current.toString());
            return;
        }
        if(open < n){
            current.append('(');
            backtrack(result,current,n,open+1,close);
            current.deleteCharAt(current.length() - 1);
        }
        if(close < open){//As soon as i open the bracket must be closed so close < open
            current.append(')');
            backtrack(result,current,n,open,close+1);
            current.deleteCharAt(current.length() - 1);
        }
    }
}