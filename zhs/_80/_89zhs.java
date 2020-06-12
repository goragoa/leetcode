package _80;

import java.util.ArrayList;

public class _89zhs {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int num = 1 << n;
        for (int i = 0; i < num; i++) {
            res.add(i >> 1 ^ i);
        }
        return res;
    }
}