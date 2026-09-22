class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '*' || ch == '-'){
                String left = expression.substring(0,i);
                String right = expression.substring(i+1);
                List<Integer> leftResults = diffWaysToCompute(left);
                List<Integer> rightResults = diffWaysToCompute(right);
                for(int l : leftResults){
                    for(int r : rightResults){
                        if(ch == '+'){
                            result.add(l+r);
                        }else if(ch == '-'){
                            result.add(l-r);
                        }else{
                            result.add(l*r);
                        }
                    }
                }
            }
        }
        if(result.size() == 0){
            result.add(Integer.parseInt(expression));
        }
        return result;
    }
}