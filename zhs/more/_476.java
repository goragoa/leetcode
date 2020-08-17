package more;

/**
 * @author
 * @Description
 * @date 8/17/2020 9:11 PM
 */
public class _476 {
    public static int findComplement(int num) {
        long a = 1L;
        while (a <= num) {
            a *= 2;
        }
        return (int) (a - num - 1);
    }

    public static void main(String[] args) {
        System.out.println(findComplement(2));
    }
}
