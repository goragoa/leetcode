package _20;

public class _28zhs {
    public int charToInt(int idx, String s) {
        return (int) s.charAt(idx) - (int) 'a';
    }

    public int strStr(String haystack, String needle) {
        int L = needle.length(), n = haystack.length();
        if (L > n) return -1;
        int a = 26;
        long modulus = (long) Math.pow(2, 31);
        long h = 0, refH = 0;
        for (int i = 0; i < L; i++) {
            h = (h * a + charToInt(i, haystack)) % modulus;
            refH = (refH * a + charToInt(i, needle)) % modulus;
        }
        if (h == refH) return 0;
        long aL = 1;
        for (int i = 1; i <= L; i++) {
            aL = (aL * a) % modulus;
        }
        for (int i = 1; i < n - L + 1; i++) {
            h = (h * a - charToInt(i - 1, haystack) * aL
                    + charToInt(i + L - 1, haystack)) % modulus;
            if (h == refH) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        _28zhs t = new _28zhs();
        System.out.println(t.strStr("hello","ll"));
    }
}
