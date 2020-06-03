package _10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _18zhs {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        int length = nums.length;
        for (int k = 0; k < length - 3; k++) {
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int min1 = nums[k] + nums[k + 1] + nums[k + 2] + nums[k + 3];
            if (min1 > target) break;
            int max1 = nums[k] + nums[length - 1] + nums[length - 2] + nums[length - 3];
            if (max1 < target) continue;
            for (int i = k + 1; i < length - 2; i++) {
                if (i > k + 1 && nums[i] == nums[i - 1]) continue;
                int j = i + 1;
                int h = length - 1;
                int min = nums[k] + nums[i] + nums[j] + nums[j + 1];
                if (min > target) break;
                int max = nums[k] + nums[i] + nums[h] + nums[h - 1];
                if (max < target) continue;
                while (j < h) {
                    int curr = nums[k] + nums[j] + nums[h] + nums[i];
                    if (curr > target) {
                        while(j<h&&nums[h]==nums[--h]);
                    } else if (curr < target) {
                        while(j<h&&nums[j]==nums[++j]);
                    } else {
                        result.add(Arrays.asList(nums[k], nums[i], nums[j], nums[h]));
                        while(j<h&&nums[h]==nums[--h]);
                        while(j<h&&nums[j]==nums[++j]);
                    }
                }
            }
        }
        return result;
    }
}
