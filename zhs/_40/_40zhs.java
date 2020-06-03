package _40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _40zhs {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> list = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) return lists;
        Arrays.sort(candidates);
        process(0, candidates, target);
        return lists;
    }

    public void process(int start, int[] candidates, int target) {
        if (target == 0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        if (start == candidates.length||target < candidates[start])
            return;
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            process(i + 1, candidates, target - candidates[i]);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        _40zhs test = new _40zhs();
        System.out.println(test.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }
}
