class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] digits = String.valueOf(n).toCharArray();
        int numLen = digits.length;
        for(int i = numLen - 1; i > 0; i--){
            if(digits[i-1] > digits[i]){
                digits[i-1]--;
                numLen = i;
            }
        }
        for(int j = numLen; j < digits.length; j++){
            digits[j] = '9';
        }
        return Integer.parseInt(new String(digits));
    }
}