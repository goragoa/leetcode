package _50;

class _50zhs {
    public double myPow(double x, int n) {
        boolean flag = true;
        if (n < 0) {
            flag = false;
        }
        double ans = 1.0;
        while (n != 0) {
            if (n % 2 != 0) {
                ans *= x;
            }
            x *= x;
            n = n / 2;
        }
        if (!flag) {
            ans = 1 / ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        _50zhs t = new _50zhs();
        System.out.println(t.myPow(2.0, 10));
    }
}