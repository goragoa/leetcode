public class _1071ytt {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
    private int gcd(int a, int b){
        return b == 0? a: gcd(b, a%b);
    }

    public static void main(String[] args) {
        _1071ytt test = new _1071ytt();
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(test.gcdOfStrings(str1, str2));
    }
}
