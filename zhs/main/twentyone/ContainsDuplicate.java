package main.twentyone;

import java.util.HashSet;
import java.util.Set;

/**
 * Created on 2020/9/15 18:55.
 *
 * @author zhangshuo
 * @email zhangshuo@css.com.cn
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
