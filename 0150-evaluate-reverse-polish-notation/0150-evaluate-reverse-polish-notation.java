class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> result = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = result.pop();
                int a = result.pop();
                if(token.equals("+")){
                    result.push(a+b);
                }else if(token.equals("-")){
                    result.push(a-b);
                }else if(token.equals("*")){
                    result.push(a*b);
                }else if(token.equals("/")){
                    result.push(a/b);
                }
            }else{
                result.push(Integer.parseInt(token));
            }
        }
        return result.peek();
    }
}