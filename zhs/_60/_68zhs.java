//package _60;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class _68zhs {
//    String[] words;
//    int maxWidth;
//    List<String> res;
//
//    public int[] countSpace(int spaceNum, int n) {
//        int[] res = new int[n];
//        for (int i = 0; i < n; i++) {
//            res[n - 1 - i] = spaceNum / (n - i);
//            spaceNum -= res[n - 1 - i];
//        }
//        return res;
//    }
//
//    public void addLine(int begin, int end) {
//        StringBuilder sb = new StringBuilder();
//        if(begin!=end){
//            int totalLen = 0;
//            for (int i = begin; i <= end; i++) {
//                totalLen += words[i].length();
//            }
//            int spaceNum = maxWidth - totalLen;
//            int[] spaceCount = countSpace(spaceNum, end - begin);
//            for (int i = begin; i < end; i++) {
//                sb.append(words[i]);
//                sb.append(" ".repeat(spaceCount[i - begin]));
//            }
//            sb.append(words[end]);
//        }else{
//            sb.append(words[end]);
//            sb.append(" ".repeat(maxWidth-sb.length()));
//        }
//        res.add(sb.toString());
//    }
//
//    public void addLastLine(int begin) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = begin; i <= words.length - 2; i++) {
//            sb.append(words[i]);
//            sb.append(" ");
//        }
//        sb.append(words[words.length - 1]);
//        sb.append(" ".repeat(maxWidth-sb.length()));
//        res.add(sb.toString());
//    }
//
//    public void divideLine() {
//        int i = 0, j = -1;
//        int tempLen = 0;
//        while (true) {
//            if (j == words.length - 1) {
//                addLastLine(i);
//                break;
//            }
//            tempLen += (words[j + 1].length() + 1);
//            if (tempLen > maxWidth + 1) {
//                addLine(i, j);
//                i = j + 1;
//                tempLen = 0;
//            } else j++;
//        }
//    }
//
//    public List<String> fullJustify(String[] words, int maxWidth) {
//        this.words = words;
//        this.maxWidth = maxWidth;
//        res = new ArrayList<>();
//        divideLine();
//        return res;
//    }
//
//    public static void main(String[] args) {
//        _68zhs test = new _68zhs();
//        System.out.println(test.fullJustify(new String[]{"what", "must", "be", "acknowledgement", "shall", "be"}, 16));
//    }
//}
