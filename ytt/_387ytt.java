public class _387ytt {
    public int firstUniqChar(String s) {
        int[] save = new int[26];
        for(char ch: s.toCharArray()){
            save[ch-'a']++;
        }
        for(int i=0 ; i<s.length() ; i++){
            if(save[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        _387ytt test = new _387ytt();
        String s = "leetcode";
        System.out.println(test.firstUniqChar(s));
    }
}
