class Solution {
    public String trimTrailingVowels(String s) {
        int ptr = s.length() - 1;
        while(ptr >= 0 && isVowel(s.charAt(ptr))){
            ptr--;
        }
        return s.substring(0, ptr + 1);
    }
    public static boolean isVowel(char c){
        return c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}