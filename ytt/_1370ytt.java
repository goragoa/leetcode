import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _1370ytt {
    public String sortString(String s) {
        char[] count = new char[26];
        for (char c : s.toCharArray()){
            count[c-'a'] += 1;
        }
        StringBuilder ans = new StringBuilder();
        while (ans.length() != s.length()){
            for(int i=0 ; i<26 ; i++){
                if(count[i] == 0){
                    continue;
                }
                ans.append((char)('a'+i));
                count[i] -= 1;
            }
            for(int i=25 ; i>=0 ; i--){
                if(count[i] == 0){
                    continue;
                }
                ans.append((char)('a'+i));
                count[i] -= 1;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        _1370ytt test = new _1370ytt();
        String s = "spo";
        System.out.println(test.sortString(s));
    }
}
