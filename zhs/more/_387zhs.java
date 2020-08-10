package more;

public class _387zhs {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _387zhs t = new _387zhs();
        System.out.println(t.firstUniqChar("leetcode"));
        System.out.println(t.firstUniqChar("loveleetcode"));
    }
}
