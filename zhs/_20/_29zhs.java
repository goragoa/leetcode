package _20;

public class _29zhs {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) return 0;
        if (divisor == 1) return dividend;
        if (divisor == -1) return dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : -dividend;
        int flag = ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) ? 1 : -1;
        dividend = dividend < 0 ? dividend : -dividend;
        divisor = divisor < 0 ? divisor : -divisor;
        return flag == 1 ? div(dividend, divisor) : -div(dividend, divisor);
    }

    public int div(int a, int b) {
        if (a > b) return 0;
        int count = 1;
        int tb = b;
        while (tb >= -Math.pow(2, 30) && tb + tb >= a) {
            count += count;
            tb += tb;
        }
        return div(a - tb, b) + count;
    }
}
