package _90;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _93zhs {
    int n;
    String s;
    LinkedList<String> segments = new LinkedList<String>();
    ArrayList<String> output = new ArrayList<>();

    public boolean valid(String segment) {
        int m = segment.length();
        if (m > 3)
            return false;
        return (segment.charAt(0) != '0') ? (Integer.valueOf(segment) <= 255) : (m == 1);
    }

    public void updateOutput(int currPos) {
        String segment = s.substring(currPos + 1, n);
        if (valid(segment)) {
            segments.add(segment);
            output.add(String.join(".", segments));
            segments.removeLast();
        }
    }

    public void backtrack(int prevPos, int dots) {
        int maxPos = Math.min(n - 1, prevPos + 4);
        for (int currPos = prevPos + 1; currPos < maxPos; currPos++) {
            String segment = s.substring(prevPos + 1, currPos + 1);
            if (valid(segment)) {
                segments.add(segment);
                if (dots - 1 == 0) {
                    updateOutput(currPos);
                } else {
                    backtrack(currPos, dots - 1);
                }
                segments.removeLast();
            }
        }
    }

    public List<String> restoreIpAddresses(String s) {
        n = s.length();
        this.s = s;
        backtrack(-1, 3);
        return output;
    }
    public static void main(String[] args){
        _93zhs test = new _93zhs();
        System.out.println(test.restoreIpAddresses("25525511135").toString());
    }
}