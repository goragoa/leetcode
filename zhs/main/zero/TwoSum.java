package main.zero;

import java.util.HashMap;

/**
 * @author zhangshuo
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>(10);
        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(target - nums[i])) {
                return new int[]{i, indexMap.get(target - nums[i])};
            }
//            Because each input would have exactly one solution.
            if (!indexMap.containsKey(nums[i])) {
                indexMap.put(nums[i], i);
            }
        }
//        Invalid input.
        return new int[]{-1, -1};
    }
}
