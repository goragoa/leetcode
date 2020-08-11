public class j11_ytt {
    public int minArray(int[] numbers) {
        int length = numbers.length;
        if(length == 0){
            return 0;
        }
        int left = 0;
        int right = length-1;
        while(left < right){
            int mid = (left+right)/2;
            if(numbers[mid] > numbers[right]){
                left = mid+1;
            }
            else if(numbers[mid] == numbers[right]){
                right--;
            }
            else{
                right = mid;
            }

        }
        return numbers[left];
    }

    public static void main(String[] args) {
        j11_ytt test = new j11_ytt();
        int[] ints = new int[]{2,2,2,0,1};
        System.out.println(test.minArray(ints));
    }
}
