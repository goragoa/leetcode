public class _6zhs {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0) return "";
        if (numRows == 1) return s;
        int direction = 1;
        int row = 0;
        StringBuffer[] stringBuffers = new StringBuffer[Math.min(numRows, s.length())];
        for (int i = 0; i < stringBuffers.length; i++) {
            stringBuffers[i] = new StringBuffer();
        }
        for (int i = 0; i < s.length(); i++) {
            stringBuffers[row].append(s.charAt(i));
            if (row == 0) direction = 1;
            if (row == numRows - 1) direction = -1;
            row += direction;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuffer part :
                stringBuffers) {
            ans.append(part.toString());
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        _6zhs test = new _6zhs();
        System.out.println(test.convert("AB", 1));
    }
}
