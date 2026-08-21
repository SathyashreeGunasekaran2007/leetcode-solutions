class Solution {
    public int mirrorDistance(int n) {
        int temp = n;
        int reverse = 0;
        while(n > 0){
            int last = n % 10;
            reverse = reverse * 10 + last;
            n = n / 10;
        }
        return Math.abs(temp - reverse);
    }
}