package main.zero;

public class _8zhs {

    // 0--start 1--signed 2--in_number 3--end
    public int getCol(char c) {
        if (c == ' ') return 0;
        if (c == '+' || c == '-') return 1;
        if (Character.isDigit(c)) return 2;
        return 3;
    }

    public int myAtoi(String str) {
        int st = 0;
        int sign = 1;
        int res = 0;
        int[][] table = new int[][]{{0, 1, 2, 3}, {3, 3, 2, 3}, {3, 3, 2, 3}, {3, 3, 3, 3}};
        for (int i = 0; i < str.length(); i++) {
            st = table[st][getCol(str.charAt(i))];
            if (st == 1) {
                sign = str.charAt(i) == '+' ? 1 : -1;
            }
            if (st == 2) {
                int pop = str.charAt(i) - '0';
                if (sign == 1 && (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > 7)))
                    return Integer.MAX_VALUE;
                if (sign == -1 && (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > 8)))
                    return Integer.MIN_VALUE;
                res = res * 10 + pop;
            }
            if (st == 3) break;
        }
        return sign == 1 ? res : -res;
    }

    public static void main(String[] args) {
        _8zhs test = new _8zhs();
        System.out.println((int) '2' - '0');
        System.out.println(test.myAtoi("  4231 my integer"));
    }
}
