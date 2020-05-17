import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0806m_zhs {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C, int n) {
        if (n == 1) {
            C.add(A.get(A.size() - 1));
            A.remove(A.size() - 1);
        } else {
            hanota(A, C, B, n - 1);
            C.add(A.get(A.size() - 1));
            A.remove(A.size() - 1);
            hanota(B, A, C, n - 1);
        }
    }

    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        if (A.size() == 0)
            return;
        hanota(A, B, C, A.size());
    }

    public static void main(String[] args) {
        _0806m_zhs t = new _0806m_zhs();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();
        for (int i = 14; i >= 0; i--) {
            A.add(i);
        }
        t.hanota(A, B, C);
        System.out.println(Arrays.toString(C.toArray()));
    }
}