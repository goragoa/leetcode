package _10;

public class _14zhs {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (String str : strs) {
            while (str.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        _14zhs test = new _14zhs();
        System.out.println(test.longestCommonPrefix(new String[]{"flower", "flight"}));
    }
}
