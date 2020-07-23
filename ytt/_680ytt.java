import java.util.Arrays;

public class _680ytt {
//    public boolean validPalindrome(String s) {
//        char[] ch = s.toCharArray();
//        if(s.length() <= 2) {
//            return true;
//        }
//        int head = 0;
//        int tail = s.length()-1;
//        int delete = 0;
//        for( ; head!=tail && head-tail<0; ){
//            if(ch[head] == ch[tail]){
//                head++;
//                tail--;
//            }
//            else if(delete==0 && head+1==tail){
//                return true;
//            }
//            else if(delete==0 && ch[head+1] == ch[tail]){
//                head+=2;
//                tail--;
//                delete++;
//            }
//            else if(delete==0 && ch[head] == ch[tail-1]){
//                head++;
//                tail-=2;
//                delete++;
//            }
//            else{
//                return false;
//            }
//        }
//        return delete<=1;
//    }

    public boolean validPalindrome(String s) {
        int head = 0;
        int tail = s.length()-1;
        while (head < tail){
            if(s.charAt(head) != s.charAt(tail)){
                String s1 = s.substring(head+1,tail+1);
                String s2 = s.substring(head,tail);
                return isNot(s1)||isNot(s2);
            }
            head++;
            tail--;
        }
        return true;
    }

    public boolean isNot(String s){
        int head = 0;
        int tail = s.length()-1;
        while (head < tail){
            if(s.charAt(head) != s.charAt(tail)){
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

    public static void main(String[] args) {
        _680ytt test = new _680ytt();
        System.out.println(test.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }
}

