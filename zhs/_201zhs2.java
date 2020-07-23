import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class _201zhs2 {
    List<List<Integer>> edges;
    int[] indeg;
    List<Integer> result;

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<>();
        result = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<Integer>());
        }
        indeg = new int[numCourses];
        for (int[] couple : prerequisites) {
            indeg[couple[1]]++;
            edges.get(couple[1]).add(couple[0]);
        }
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int u = q.poll();
            result.add(u);
            for (Integer v : edges.get(u)) {
                indeg[v]--;
                if (indeg[v] == 0) {
                    q.add(v);
                }
            }
        }
        if (result.size() != numCourses) {
            return new int[] {};
        }
        int[] ans = new int[numCourses];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = result.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        _201zhs2 t = new _201zhs2();
        System.out.println(t.findOrder(2, new int[][] { { 1, 0 } }));
    }
}