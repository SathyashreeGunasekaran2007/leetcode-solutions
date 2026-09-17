class Solution {
    public int maxProduct(String[] words) {
        int max = 0;
        for(int i = 0; i < words.length; i++){
            HashSet<Character> set = new HashSet<>();
            for(char ch : words[i].toCharArray()){
                set.add(ch);
            }
            for(int j = i+1; j < words.length; j++){
                boolean common = false;
                for(char ch : words[j].toCharArray()){
                    if(set.contains(ch)){
                        common = true;
                        break;
                    }
                }
                if(!common){
                    max = Math.max(max,words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }
}