import java.util.ArrayList;
import java.util.List;

public class _1237zhs {
    interface CustomFunction {
        public int f(int x, int y);
    };

    public static class cu implements CustomFunction {
        public int f(int x, int y) {
            return x + y;
        }
    }

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> ans = new ArrayList<>();
        int x = 1;
        int y = 1000;
        while (x <= 1000 && y >= 1) {
            if (customfunction.f(x, y) == z) {
                List<Integer> tmp = new ArrayList<>();
                tmp.add(x);
                tmp.add(y);
                ans.add(tmp);
                x++;
                y--;
            } else if (customfunction.f(x, y) < z) {
                x++;
            } else if (customfunction.f(x, y) > z) {
                y--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        _1237zhs t = new _1237zhs();
        CustomFunction c = new cu();
        System.out.println(t.findSolution(c, 5));
    }
}
