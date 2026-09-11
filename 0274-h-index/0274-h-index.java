import java.util.Arrays;
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        for(int i = citations.length - 1; i >= 0; i--){
            int papers = citations.length - i;
            if(citations[i] >= papers){
                h = papers;
            }else{
                break;
            }
        }
        return h;
    }
}