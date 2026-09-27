class Solution {
    boolean found = false;
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> result = new ArrayList<>();
        backtrack(num,0,result);
        return result;
    }
    public void backtrack(String num, int index, List<Integer> result){
        if(index == num.length()){
            if(result.size() >= 3){
                found = true;
                return;
            }
            return;
        }
        long number = 0;
        for(int i = index; i < num.length(); i++){
            if(num.charAt(index) == '0' && i > index){
                break;
            }
            number = number * 10 + (num.charAt(i) - '0');
            if(number > Integer.MAX_VALUE){
                break;
            }
            if(result.size() >= 2){
                long sum = (long) result.get(result.size() - 1) + result.get(result.size() - 2);
                if(number < sum){
                    continue;
                }
                if(number > sum){
                    break;
                }
            }
            result.add((int) number);
            backtrack(num,i+1,result);
            if(found){
                return;
            }
            result.remove(result.size() - 1);
        }
    }
}