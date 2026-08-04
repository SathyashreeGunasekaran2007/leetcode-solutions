class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        StringBuilder res = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i < l1 && j < l2){
            res.append(word1.charAt(i));
            res.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i < l1){
            res.append(word1.charAt(i));
            i++;
        }
        while(j < l2){
            res.append(word2.charAt(j));
            j++;
        }
        return res.toString();
    }
}