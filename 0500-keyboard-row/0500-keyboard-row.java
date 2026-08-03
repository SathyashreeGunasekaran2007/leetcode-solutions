class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            String lc = words[i].toLowerCase();
            String row = "";
            if(s1.contains("" + lc.charAt(0))){
                row = s1;
            }else if(s2.contains("" + lc.charAt(0))){
                row = s2;
            }else{
                row = s3;
            }
            boolean valid = true;
            for(int j = 0; j < lc.length(); j++){
                if(!row.contains("" + lc.charAt(j))){
                    valid = false;
                    break;
                }
            }
            if(valid){
                ans.add(words[i]);
            }
        }
        return ans.toArray(new String[0]);
    }
}