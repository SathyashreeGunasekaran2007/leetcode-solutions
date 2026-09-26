class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        backtrack(num,target,0,0,0,current,result);
        return result;
    }
    public void backtrack(String num, int target,int index,long value, long previous, StringBuilder current, List<String> result){
        if(index == num.length()){
            if(value == target){
                result.add(current.toString());
            }
            return;
        }
        for(int i = index; i < num.length(); i++){
            if(i > index && num.charAt(index) == '0'){
                break;
            } 
            String part = num.substring(index,i+1);
            long number = Long.parseLong(part);
            if(index == 0){
                current.append(part);
                backtrack(num,target,i+1,number,number,current,result);
                current.delete(current.length()-part.length(),current.length());
            }else{
                current.append("+");
                current.append(part);
                backtrack(num,target,i+1,value+number,number,current,result);
                current.delete(current.length()-part.length()-1,current.length());
                current.append("-");
                current.append(part);
                backtrack(num,target,i+1,value-number,-number,current,result);
                current.delete(current.length()-part.length()-1,current.length());
                current.append("*");
                current.append(part);
                backtrack(num,target,i+1,value-previous+previous*number,previous*number,current,result);
                current.delete(current.length()-part.length()-1,current.length());
            }
        }
    }
}