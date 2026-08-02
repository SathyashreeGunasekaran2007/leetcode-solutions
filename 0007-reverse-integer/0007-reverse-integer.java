class Solution {
    public int reverse(int x) {
        boolean sign = true;
        if(x < 0)
            sign = false;
        x = Math.abs(x);
        long rev = 0;
        while(x > 0)
        {
            rev = (rev * 10) + (x % 10);
            x = x / 10;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        if(!sign)
            return -1*(int)rev;
        return (int)rev;
    }
}