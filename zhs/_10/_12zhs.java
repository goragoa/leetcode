//package _10;
//
//public class _12zhs {
//    public String intToRoman(int num) {
//        StringBuilder ans = new StringBuilder();
//        int[] numbs = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//        String[] characters = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//        for (int i = 0; i < numbs.length; i++) {
//            int temp = num / numbs[i];
//            ans.append(characters[i].repeat(Math.max(0, temp)));
//            num = num % numbs[i];
//            if (num == 0) break;
//        }
//        return ans.toString();
//    }
//
//    public static void main(String[] args) {
//        _12zhs test = new _12zhs();
//        System.out.println(test.intToRoman(58));
//    }
//}
