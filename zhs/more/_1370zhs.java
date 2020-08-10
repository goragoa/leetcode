package more;

public class _1370zhs {
    public String sortString(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        while (ans.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    count[i]--;
                    ans.append((char) ('a' + i));
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (count[i] != 0) {
                    count[i]--;
                    ans.append((char) ('a' + i));
                }
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        _1370zhs t = new _1370zhs();
        System.out.println(t.sortString("aaaabbbbcccc"));
    }
}
