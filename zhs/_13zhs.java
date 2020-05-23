import java.util.HashMap;

public class _13zhs {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) return 0;
        int[] numbs = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] characters = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numbs.length; i++) {
            map.put(characters[i], numbs[i]);
        }
        int ans = 0;
        int i = 0;
        while (i < s.length() - 1) {
            if (map.containsKey(s.substring(i, i + 2))) {
                ans += map.get(s.substring(i, i + 2));
                i += 2;
                continue;
            }
            ans += map.get(s.substring(i, i + 1));
            i += 1;
        }
        if (i == s.length() - 1) ans += map.get(s.substring(s.length() - 1));
        return ans;
    }

    public static void main(String[] args) {
        _13zhs test = new _13zhs();
        System.out.println(test.romanToInt("XXIV"));
    }
}
