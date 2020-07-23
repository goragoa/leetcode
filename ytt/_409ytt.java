import java.util.Arrays;
import java.util.Stack;

public class _409ytt {
    public int longestPalindrome(String s) {
        if(s.length() <= 1){
            return s.length();
        }
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        int ans = 0;
        for(int i = 0 ; i < s.length() ; ){
            if(i+1 == s.length()){
                ch[0] = '0';
                break;
            }
            if(ch[i] == ch[i+1]){
                ans++;
                i+=2;
            }
            else{
                ch[0] = '0';
                i++;
            }
        }
        return  (ans*2)+(ch[0]=='0'?1:0);
    }

    public static void main(String[] args) {
        _409ytt test = new _409ytt();
        System.out.println(test.longestPalindrome("ccc"));
    }
}
