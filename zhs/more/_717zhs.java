package more;

public class _717zhs {
    public boolean isValidCharacter(int[] bits) {
        if (bits.length == 0 || bits.length == 1) {
            return true;
        }
        int index = bits.length - 2;
        int tmp = 0;
        while (index >= 0) {
            if (bits[index] == 0) {
                return tmp % 2 == 0;
            }
            index--;
            tmp++;
        }
        return tmp % 2 == 0;
    }

    public boolean isOneBitCharacter(int[] bits) {
        return isValidCharacter(bits);
    }

    public static void main(String[] args) {
        _717zhs t = new _717zhs();
        System.out.println(t.isOneBitCharacter(new int[] { 1, 1, 1, 0 }));
    }
}
