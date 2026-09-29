class Solution {
    int[] dp;
    public int minCut(String s) {
        dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return backtrack(0,s);
    }
    private int backtrack(int index,String s){
        if(index == s.length()){
            return -1;
        }
        if(dp[index] != -1){
            return dp[index];
        }
        int min = Integer.MAX_VALUE;
        for(int i = index; i < s.length(); i++){
            if(isPalindrome(s,index,i)){
                int cuts = 1 + backtrack(i+1,s);   
                min = Math.min(min,cuts);
            }
        }
        return dp[index] = min;
    }
    private boolean isPalindrome(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}