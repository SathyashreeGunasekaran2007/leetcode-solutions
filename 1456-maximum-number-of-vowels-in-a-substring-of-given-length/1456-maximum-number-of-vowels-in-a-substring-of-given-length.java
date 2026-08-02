class Solution {
    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int current = 0;
        int max = 0;
        for(int i = 0; i < k; i++){
            if(isVowel(s.charAt(i))){
                current++;
            }
        }
        max = current;
        for(int i = k; i < s.length(); i++){
            if(isVowel(s.charAt(i - k))){
                current--;
            }
            if(isVowel(s.charAt(i))){
                current++;
            }
            max = Math.max(max,current);
        }
        return max;
    }
}