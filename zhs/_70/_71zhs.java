package _70;

import java.util.Stack;

public class _71zhs {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] str = path.split("/");
        for (String s :
                str) {
            if (s.equals("..")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else if (!s.equals("") && !s.equals(".")) {
                stack.push(s);
            }
        }
        if (stack.empty()) return "/";
        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append("/").append(s);
        }
        return sb.toString();
    }
}
