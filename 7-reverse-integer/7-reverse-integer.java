class Solution {
    public int reverse(int x) {
        int signMultiplier = 1;
        if (x < 0) {
            signMultiplier = -1;
            x = signMultiplier * x;
        }
        int res = 0;
        while (x > 0) {
            if (res * signMultiplier > Integer.MAX_VALUE / 10 || res * signMultiplier < Integer.MIN_VALUE / 10)             {
                return 0;
            }
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return (int)(signMultiplier * res);
    }
}