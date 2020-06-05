package _60;

public class _62zhs {
    public long factorial(int m) {
        if (m == 1) return m;
        else return m * factorial(m - 1);
    }

    public int uniquePaths(int m, int n) {
        return (int) (factorial(m + n - 1) / (factorial(m - 1) * factorial(n - 1)));
    }
}
