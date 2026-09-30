class Solution {
    public int climbStairs(int n) {
        if(n == 1){
            return n;
        }
        if(n == 2){
            return n;
        }
        int twosteps = 1;
        int onesteps = 2;
        for(int i = 3; i <= n; i++){
            int current = twosteps + onesteps;
            twosteps = onesteps;
            onesteps = current;
        }
        return onesteps;   
    }
}