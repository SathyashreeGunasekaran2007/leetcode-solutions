class Solution {
    public int kthGrammar(int n, int k) {
        if(n == 1){
            return 0;
        }
        int parent = (k + 1)/2;
        int value = kthGrammar(n-1,parent);
        if(k % 2 == 0){
            return value ^ 1;
        }
        return value;
    }
}