package _60;

public class _66zhs {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
                if (i == 0) {
                    digits = new int[digits.length + 1];
                    digits[0]++;
                }
            }
        }
        return digits;
    }
}
