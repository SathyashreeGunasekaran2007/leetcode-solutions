class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s,0,"",result);
        return result;
    }
    public void backtrack(String s, int index, String current, List<String> result){
        if(index == s.length()){
            result.add(current);
            return;
        }
        char c = s.charAt(index);
        if(Character.isDigit(c)){
            backtrack(s,index+1,current+c,result);
        }else{
            backtrack(s,index+1,current+Character.toLowerCase(c),result);
            backtrack(s,index+1,current+Character.toUpperCase(c),result);
        }
    }
}