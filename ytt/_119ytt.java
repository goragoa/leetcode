import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _119ytt {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            return list;
        }

        if(rowIndex==1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(1);
            return list;
        }

        List<Integer> pre = new ArrayList<>();
        pre.add(1);pre.add(1);pre.add(1);
        List<Integer> cur = new ArrayList<>();

        for(int i=2 ; i<=rowIndex ; i++){
            cur = new ArrayList<>();
            for(int j=0 ; j<=i ; j++){
                if(j==0 || j==i){
                    cur.add(1);
                }
                else{
                    cur.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre = cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        _119ytt test = new _119ytt();
        System.out.println(test.getRow(3));
    }
}
