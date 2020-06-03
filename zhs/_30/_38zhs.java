package _30;

public class _38zhs {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        String ans = "1";
        for (int i = n; i > 1; i--) {
            int count = 1;
            int num = Character.getNumericValue(ans.charAt(0));
            StringBuilder tmp = new StringBuilder();
            for (int j = 1; j < ans.length(); j++) {
                if (num != Character.getNumericValue(ans.charAt(j))) {
                    tmp.append(count);
                    tmp.append(num);
                    count = 1;
                    num = Character.getNumericValue(ans.charAt(j));
                } else {
                    count++;
                }
            }
            tmp.append(count);
            tmp.append(num);
            ans = tmp.toString();
        }
        return ans;
    }

    public static void main(String[] args) {
        _38zhs test = new _38zhs();
        System.out.println(test.countAndSay(5));
    }
}
