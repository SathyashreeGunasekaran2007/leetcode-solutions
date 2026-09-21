class Solution {
    public int lastRemaining(int n) {
        return solve(1,1,n,true);
    }
    public int solve(int head, int step, int remaining, boolean leftToRight){
        if(remaining == 1){
            return head;
        }
        if(leftToRight || remaining % 2 == 1){
            head += step;
        }
        remaining /= 2;
        step *= 2;
        leftToRight = !leftToRight;
        return solve(head,step,remaining,leftToRight);
    }
}