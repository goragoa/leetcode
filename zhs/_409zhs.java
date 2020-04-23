public class _409zhs {
    public int longestPalindrome(String s) {
        int[] count = new int[123];
        int ans = 0;
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int num :
                count) {
            ans += (num / 2 * 2);
            if (num % 2 == 1) {
                flag = true;
            }
        }
        if(flag){
            return ans+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        _409zhs test = new _409zhs();
        System.out.println(test.longestPalindrome("abccccdd"));
    }
}
