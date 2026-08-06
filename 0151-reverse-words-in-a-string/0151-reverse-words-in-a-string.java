class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split("\\s+");
        int l = 0;
        int r = str.length - 1;
        while(l < r){
            String temp = str[l];
            str[l] = str[r];
            str[r] = temp;
            l++;
            r--;
        }
        s = String.join(" ",str);
        return s;
    }
}