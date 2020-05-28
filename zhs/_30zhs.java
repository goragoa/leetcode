import java.util.*;

public class _30zhs {
    public List<Integer> findSubstring(String s, String[] words) {
        if (words.length == 0) return new ArrayList<>();
        int wordL = words[0].length();
        int idxL = s.length() - words.length * wordL + 1;

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < idxL; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            if (isValid(i, wordL, s, map)) res.add(i);
        }
        return res;
    }

    public boolean isValid(int i, int wordL, String s, HashMap<String, Integer> map) {
        while (!map.isEmpty()) {
            String str = s.substring(i, i + wordL);
            if (!map.containsKey(str)) return false;
            if (map.get(str) == 1) map.remove(str);
            else map.put(str, map.get(str) - 1);
            i = i + wordL;
        }
        return true;
    }

    public static void main(String[] args) {
        _30zhs test = new _30zhs();
        System.out.println(test.findSubstring("barfoothefoobarman", new String[]{"bar", "foo"}));
    }
}
