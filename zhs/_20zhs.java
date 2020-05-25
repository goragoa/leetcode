import java.util.Stack;

public class _20zhs {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) return true;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else if (stack.empty()) {
                return false;
            } else if (s.charAt(i) == ')') {
                if (stack.pop() != '(') return false;
            } else if (s.charAt(i) == ']') {
                if (stack.pop() != '[') return false;
            } else {
                if (stack.pop() != '{') return false;
            }
        }
        return stack.empty();
    }
}
