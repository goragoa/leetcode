package _60;

public class _67zhs {
    public String addBinary(String a, String b) {
        int m = a.length();
        int n = b.length();
        int carry = 0;
        if (m < n) {
            String temp = a;
            a = b;
            b = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int sum = carry + (a.charAt(m - 1 - i) - '0') + (b.charAt(n - 1 - i) - '0');
            sb.append(sum % 2);
            carry = sum / 2;
        }
        for (int i = 0; i < m - n; i++) {
            int sum = carry + (a.charAt(m - 1 - n - i) - '0');
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry == 1) sb.append('1');
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        _67zhs test = new _67zhs();
        System.out.println(test.addBinary("1010", "1011"));
    }
}
