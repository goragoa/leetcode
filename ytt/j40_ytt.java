import java.lang.reflect.Array;
import java.util.Arrays;

public class j40_ytt {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] ans = new int[k];
        Arrays.sort(arr);
        for(int i=0 ; i<k ; i++){
            ans[i] = arr[i];
        }
        return ans;
    }
}
