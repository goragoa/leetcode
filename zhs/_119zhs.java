import java.util.ArrayList;
import java.util.List;

public class _119zhs {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            List<Integer> ans = new ArrayList<>();
            ans.add(1);
            return ans;
        } else if (rowIndex == 1) {
            List<Integer> ans = new ArrayList<>();
            ans.add(1);
            ans.add(1);
            return ans;
        } else {
            List<Integer> tmp = this.getRow(rowIndex - 1);
            List<Integer> ans = new ArrayList<>();
            ans.add(1);
            for (int i = 0; i < tmp.size() - 1; i++) {
                ans.add(tmp.get(i) + tmp.get(i + 1));
            }
            ans.add(1);
            return ans;
        }
    }

    public static void main(String[] args) {
        _119zhs t = new _119zhs();
        System.out.println(t.getRow(4).toString());
    }
}
