class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }
    private void backtrack(int index, String s, List<String> current, List<List<String>> result ){
        if(index == s.length()){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s,index,i)){
                current.add(s.substring(index,i + 1));
                backtrack(i + 1, s, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
    private boolean isPalindrome(String s,int left,int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}