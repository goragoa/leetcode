package _0;

public class _5zhs {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";
        int[][] isPalindorme = new int[n][n];
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n - k; i++) {
                if (k == 0)
                    isPalindorme[i][i + k] = 1;
                else if (k == 1)
                    isPalindorme[i][i + k] = s.charAt(i) == s.charAt(i + k) ? 1 : 0;
                else
                    isPalindorme[i][i + k] = (s.charAt(i) == s.charAt(i + k) && isPalindorme[i + 1][i + k - 1] == 1) ? 1 : 0;

                ans = isPalindorme[i][i + k] == 1 && k + 1 > ans.length() ? s.substring(i, i + k + 1) : ans;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        _5zhs test = new _5zhs();
        System.out.println(test.longestPalindrome("cbbd"));
    }
}
