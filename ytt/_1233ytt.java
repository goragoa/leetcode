import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class _1233ytt {
    public List<String> removeSubfolders(String[] folder) {
        List<String> ans = new LinkedList<>();
        Arrays.sort(folder);//排序按照啥排的
        ans.add("");

        int length = folder.length;
        String stri;
        String strj;
        int len;
        for(int i = length-1 ; i >= 0 ; i--){
            stri = folder[i];
            len = stri.length();
            for(int j = 0 ; j < i ; j++){
                strj = folder[j];
                if (!strj.substring(0, len).equals(stri)){
                    ans.add(strj);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        _1233ytt test = new _1233ytt();
        String[] folder = new String[]{"/a","/a/b","/c/d","/c/d/e","/c/f"};
        System.out.println(test.removeSubfolders(folder));
    }
}
