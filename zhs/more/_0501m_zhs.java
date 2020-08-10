package more;

public class _0501m_zhs {
    public int insertBits(int N, int M, int i, int j) {
        int mask = (1 << j - i + 1) - 1 << i;
        return (N & ~mask) | M << i;
    }

    public static void main(String[] args) {
        _0501m_zhs t = new _0501m_zhs();
        int N = 1143207437;
        int M = 1017033;
        System.out.println(Integer.toBinaryString(N));
        System.out.println(Integer.toBinaryString(M));
        int x = t.insertBits(N, M, 11, 31);
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
    }
}
