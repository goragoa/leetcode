import java.util.HashSet;
import java.util.Set;

public class _202ytt {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n))
        {
            set.add(n);
            n = sum(n);
        }
        return n == 1;
    }

    public int sum(int n){
        int sum = 0;
        while(n>0){
            sum += Math.pow(n%10,2);
            n = (int)n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        _202ytt test = new _202ytt();
        System.out.println(test.sum(19));
        System.out.println(test.isHappy(19));
    }
}
