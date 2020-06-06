package _60;

public class _69zhs {
    public int mySqrt(int x, int a, int b) {
        int middle = (a + b) / 2;
        if (middle * middle == x) {
            return middle;
        } else if (middle * middle < x) {
            if (middle >= 46340)
                return 46340;
            if ((middle + 1) * (middle + 1) > x) {
                return middle;
            } else {
                return mySqrt(x, middle + 1, b);
            }
        } else {
            if ((middle - 1) * (middle - 1) < x) {
                return middle - 1;
            } else {
                return mySqrt(x, a, middle - 1);
            }
        }
    }

    public int mySqrt(int x) {
        return mySqrt(x, 0, 46340);
    }

    public int mySqrt2(int x) {
        if (x == 0)
            return x;
        double C = x, x0 = x;
        while (true) {
            double xi = 0.5 * (x0 + C / x0);
            if (Math.abs(x0 - xi) < 1e-7)
                break;
            x0 = xi;
        }
        return (int) x0;
    }

    public static void main(String[] args) {
        _69zhs t = new _69zhs();
        System.out.println(t.mySqrt2(2147483647));
    }
}