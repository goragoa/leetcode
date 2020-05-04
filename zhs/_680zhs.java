public class _680zhs {
    public boolean isPalindrome(String s) {
        int begin = 0;
        int end = s.length() - 1;
        while (begin < end) {
            if (s.charAt(begin) != s.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int begin = 0;
        int end = s.length() - 1;
        while (begin < end) {
            if (s.charAt(begin) != s.charAt(end)) {
                String s1 = s.substring(begin + 1, end + 1);
                String s2 = s.substring(begin, end);
                return isPalindrome(s1) || isPalindrome(s2);
            }
            begin++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        _680zhs test = new _680zhs();
        System.out.println(test.validPalindrome("abbcad"));
    }
}
