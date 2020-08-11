package _0;

/**
 * @author
 * @Description
 * @date 2020/8/11 13:23
 */
public class j05_zhs {
    public static String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                sb.append(c);
            } else {
                sb.append("%20");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy"));
    }
}
