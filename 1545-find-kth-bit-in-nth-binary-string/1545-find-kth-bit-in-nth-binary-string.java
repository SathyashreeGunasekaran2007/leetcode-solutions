class Solution {
    public char findKthBit(int n, int k) {
        String s = build(n);
        return s.charAt(k-1);
    }
    private String build(int n){
        if(n == 0){
            return "0";
        }
        String front = build(n-1);
        StringBuilder back = new StringBuilder();
        for(int j = front.length() - 1; j >= 0; j--){
            if(front.charAt(j) == '0'){
                back.append('1');
            }else{
                back.append('0');
            }
        }
        return front + "1" + back;
    }
}