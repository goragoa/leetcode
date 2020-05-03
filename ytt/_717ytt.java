public class _717ytt {
    public boolean isOneBitCharacter(int[] bits) {
        int index = bits.length-1;
        if(index == 0){
            return true;
        }
        int count = 1;
        if(bits[--index] == 0){
            return true;
        }
        else{
            while (index > 0 && bits[--index] == 1){
                count ++;
            }
        }
        if(count%2 == 0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        _717ytt test = new _717ytt();
        int[] bits = new int[]{1,1,1,0};
        System.out.println(test.isOneBitCharacter(bits));
    }
}
