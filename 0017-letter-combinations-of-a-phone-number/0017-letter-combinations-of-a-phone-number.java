class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        String[] phoneletters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder current = new StringBuilder();
        backtrack(digits,0,result,phoneletters,current);
        return result;
    }
    public void backtrack(String digits, int index, List<String> result, String[] phoneletters,StringBuilder current){
        if(index == digits.length()){
            result.add(current.toString());
            return;
        }
        int digit = digits.charAt(index) - '0';//to take the digits from the string seperately
        String letters = phoneletters[digit];
        for(char c : letters.toCharArray()){
            current.append(c);
            backtrack(digits,index+1,result,phoneletters,current);
            current.deleteCharAt(current.length() - 1);
        }
    }

}