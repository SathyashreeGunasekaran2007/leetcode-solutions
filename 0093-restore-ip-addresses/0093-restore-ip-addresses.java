class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        backtrack(s,0,0,result,current);
        return result;
    }
    public void backtrack(String s,int index,int parts,List<String> result, StringBuilder current){
        if(parts == 4){
            if(index == s.length()){
                result.add(current.substring(0,current.length()-1));
            }
            return;
        } 
        int number = 0;
        for(int end = index; end < s.length() && end < index + 3; end++){
            if(s.charAt(index) == '0' && end > index){
                break;
            }
            number = number * 10 + (s.charAt(end) - '0');
            if(number > 255){
                break;
            }
            current.append(number);
            current.append('.');        
            backtrack(s,end+1,parts+1,result,current);
            int removeLength = String.valueOf(number).length() + 1;
            current.delete(current.length() - removeLength, current.length());
        }
    }
}