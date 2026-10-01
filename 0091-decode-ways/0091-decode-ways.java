class Solution {
    public int numDecodings(String s) {
        int twostep = 1;
        int onestep = 1;
        if(s.charAt(0) == '0') return 0;
        for(int i = 1; i <= s.length(); i++){
            int current = 0;
            if(s.charAt(i-1) != '0'){
                current += onestep;
            }
            if(i >= 2){
                int twodigit = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-1)-'0');
                if(twodigit >= 10 && twodigit <= 26){
                    current += twostep;
                }
                twostep = onestep;
                onestep = current;
            }
        }    
        return onestep;    
    }
}