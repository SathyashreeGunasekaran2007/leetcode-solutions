class Solution {
    public List<String> removeInvalidParentheses(String s) {
        Set<String> result = new HashSet<>();
        StringBuilder current = new StringBuilder();
        int removeOpen = 0;
        int removeClose = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                removeOpen++;
            }
            if(c == ')'){
                if(removeOpen > 0){
                    removeOpen--;
                }else{
                    removeClose++;
                }
            }
        }
        backtrack(s,0,0,removeOpen,removeClose,current,result);
        return new ArrayList<>(result);
    }
    public void backtrack(String s, int index, int balance, int removeOpen, int removeClose, StringBuilder current, Set<String> result){
        if(balance < 0){
            return;
        }
        if(index == s.length()){
            if(balance == 0 && removeOpen == 0 && removeClose == 0){
                result.add(current.toString());
            }
            return;
        }
        char c = s.charAt(index);
        if(c == '('){
            if(removeOpen > 0){
                backtrack(s,index+1,balance,removeOpen-1,removeClose,current,result);
            }
            current.append('(');
            backtrack(s,index+1,balance+1,removeOpen,removeClose,current,result);
            current.deleteCharAt(current.length()-1);
        }else if(c == ')'){
            if(removeClose > 0){
                backtrack(s,index+1,balance,removeOpen,removeClose-1,current,result);
            }
            if(balance > 0){
                current.append(')');
                backtrack(s,index+1,balance-1,removeOpen,removeClose,current,result);
                current.deleteCharAt(current.length()-1);
            }
        }else{
            current.append(c);
            backtrack(s,index+1,balance,removeOpen,removeClose,current,result);
            current.deleteCharAt(current.length()-1);
        }
    }
}