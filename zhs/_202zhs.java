import java.util.HashSet;
import java.util.Set;

public class _202zhs {
    public int help(int n) {
        int ans = 0;
        int m;
        while (n != 0) {
            m = n % 10;
            ans += (m * m);
            n = n / 10;
        }
        return ans;
    }

    public boolean isHappy(int n) {
        Set<Integer> tmp = new HashSet<>();
        while (n != 1) {
            if (tmp.contains(n)) {
                return false;
            } else {
                tmp.add(n);
            }
            n = help(n);
        }
        return true;
    }

    public static void main(String[] args) {
        _202zhs test = new _202zhs();
        // System.out.println(test.help(19));
        System.out.println(test.isHappy(2));
    }
}
