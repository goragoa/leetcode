import java.util.ArrayList;
import java.util.List;

public class _201zhs {
    List<List<Integer>> edges;
    int[] visited;
    List<Integer> result;
    boolean inValid;

    public void dfs(int u) {
        visited[u] = 1;
        for (int v : edges.get(u)) {
            if (visited[v] == 0) {
                dfs(v);
                if (inValid) {
                    return;
                }
            } else if (visited[v] == 1) {
                inValid = true;
                return;
            }
        }
        visited[u] = 2;
        result.add(u);
    }

    public int[] reverseArray(List<Integer> array) {
        int[] newArray = new int[array.size()];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array.get(array.size() - i - 1);
        }
        return newArray;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        edges = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<Integer>());
        }
        visited = new int[numCourses];
        result = new ArrayList<>();
        inValid = false;
        for (int[] couple : prerequisites) {
            edges.get(couple[1]).add(couple[0]);
        }
        for (int i = 0; i < numCourses && !inValid; i++) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }
        if (inValid) {
            return new int[] {};
        }
        return reverseArray(result);
    }

    public static void main(String[] args) {
        _201zhs t = new _201zhs();
        System.out.println(t.findOrder(2, new int[][] { { 1, 0 } }));
    }
}