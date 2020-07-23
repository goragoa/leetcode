package _90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _90zhs {
    ArrayList<List<Integer>> res = new ArrayList<>();
    ArrayList<Integer> onePath = new ArrayList<>();
    int n;
    int[] nums;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        this.nums = nums;
        n = nums.length;
        Arrays.sort(nums);
        backtrack(0);
        res.add(new ArrayList<Integer>());
        return res;
    }
    private void backtrack(int i) {
        if (i == n)
            return;
        for (int j = i; j < n; j++) {
            if (j > i && nums[j] == nums[j - 1])
                continue;
            onePath.add(nums[j]);
            res.add(new ArrayList<>(onePath));
            backtrack(j + 1);
            onePath.remove(onePath.size() - 1);
        }
    }
}