
public class _1071zhs {
    private int gcd2(int a, int b) {
        return (a == 0 ? b : gcd2(b % a, a));
    }

    private boolean check(String s, String pattern) {
        String tmp = pattern;
        while (tmp.length() < s.length()) {
            tmp = tmp + pattern;
        }
        if (tmp.equals(s)) {
            return true;
        }
        return false;
    }

    public String gcdOfString(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int gcd = gcd2(len1, len2);
        String ans = str1.substring(0, gcd);
        if (check(str1, ans) && check(str2, ans)) {
            return ans;
        }
        return "";
    }

    public static void main(String args[]) {
        _1071zhs test = new _1071zhs();
        String str1 = "ABABABAB";
        String str2 = "ABAB";
        System.out.println(test.gcdOfString(str1, str2));
    }
}