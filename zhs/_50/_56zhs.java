package _50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _56zhs {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 2) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for (int[] curInterval : intervals) {
            int[] peek = res.get(res.size() - 1);
            if (curInterval[0] > peek[1]) {
                res.add(curInterval);
            } else {
                peek[1] = Math.max(curInterval[1], peek[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
