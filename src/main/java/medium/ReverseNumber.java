package medium;

import static java.lang.Math.abs;

 class ReverseNumber {
     static int reverse(int x) {

        long y = 0;
        long sgn = (long) Math.signum(x);
        x = abs(x);
        while (x > 0) {
            y = y * 10L;
            y += rightValue(x);
            x /= 10;
        }
        if (y > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (sgn * y);
    }

    protected static int rightValue(int x) {
        return x - ( x / 10) * 10;
    }
}
