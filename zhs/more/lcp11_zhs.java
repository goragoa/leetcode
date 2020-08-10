package more;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author
 * @Description
 * @date 2020/8/10 12:58
 */
public class lcp11_zhs {
    public int expectNumber(int[] scores) {
        return Arrays.stream(scores).boxed().collect(Collectors.toSet()).size();
    }

    private int getMul(int[] a, int index) {
        int ans = 1;
        for (int i = 0; i < a.length; i++) {
            if (i != index) {
                ans *= a[i];
            }
        }
        return ans;
    }

    public int[] constructArr(int[] a) {
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = getMul(a, i);
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
