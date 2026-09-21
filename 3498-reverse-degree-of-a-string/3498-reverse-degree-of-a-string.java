class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            int index = s.charAt(i) - 'a';
            int rev = 26 - index;
            ans += rev * (i+1);
        }
        return ans;
    }
}