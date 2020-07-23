package _10;

import java.util.Arrays;

public class _16zhs {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int start = 0; start < nums.length - 2; start++) {
            int middle = start + 1, end = nums.length - 1;
            while (middle < end) {
                int sum = nums[start] + nums[middle] + nums[end];
                if (Math.abs(target - sum) < Math.abs(target - ans))
                    ans = sum;
                if (sum > target)
                    end--;
                else if (sum < target)
                    middle++;
                else return ans;
            }
        }
        return ans;
    }
}
