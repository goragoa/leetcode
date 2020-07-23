package _70;

import java.util.ArrayList;
import java.util.List;

public class _78zhs {
    List<List<Integer>> output = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        output.add(new ArrayList<Integer>());
        for (int num :
                nums) {
            List<List<Integer>> newSubsets = new ArrayList<>();
            for (List<Integer> curr :
                    output) {
                newSubsets.add(new ArrayList<Integer>(curr) {{
                    add(num);
                }});
            }
            output.addAll(newSubsets);
        }
        return output;
    }
}
