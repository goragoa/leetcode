package main.twentyone;

import java.util.HashMap;

/**
 * Created on 2020/9/15 19:04.
 *
 * @author zhangshuo
 * @email zhangshuo@css.com.cn
 */
public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(10);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
