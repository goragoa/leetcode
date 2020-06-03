package _30;

import java.util.ArrayList;
import java.util.List;

public class _39zhs {
    List<List<Integer>> lists = new ArrayList<>();
    List<Integer> tmp = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0 || target < 0) {
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        process(0,candidates, target, list);
        return lists;
    }

    public void process(int start, int[] candidates, int target, List<Integer> list) {
        if (target < 0) return;
        if (target == 0) {
            lists.add(new ArrayList<>(list));
        } else {
            for (int i = start; i < candidates.length; i++) {
                list.add(candidates[i]);
                process(i, candidates, target - candidates[i], list);
                list.remove(list.size() - 1);
            }
        }
    }
}
