class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length() < k){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.get(c) < k){
                String left = s.substring(0,i);
                String right = s.substring(i+1);
                int leftans = longestSubstring(left,k);
                int rightans = longestSubstring(right,k);
                return Math.max(leftans,rightans);
            }
        }
        return s.length();
    }
}