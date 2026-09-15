class Solution {
    public int[] countBits(int n) {
        int[] ones = new int[n+1];
        for(int i = 1; i <= n; i++){
            ones[i] = ones[i & (i-1)] + 1;
        }
        return ones;
    }
}