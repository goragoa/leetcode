package _20;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class _20zhs {

    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        HashMap<Character, Character> tmp = new HashMap<>();
        tmp.put(')', '(');
        tmp.put(']', '[');
        tmp.put('}', '{');
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (!tmp.containsKey(c) || stack.isEmpty() || !stack.pop().equals(tmp.get(c))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
}
