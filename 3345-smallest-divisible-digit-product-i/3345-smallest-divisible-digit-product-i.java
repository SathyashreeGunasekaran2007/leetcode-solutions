class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int temp = n;
            int product = 1;
            while(temp > 0){
                int dig = temp % 10;
                product *= dig;
                temp /= 10;
            }
            if(product % t == 0){
                return n;
            }
            n++;
        }
    }
}