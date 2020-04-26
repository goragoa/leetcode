public class _122ytt {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i=0 ; i<prices.length-1 ; i++) {
            if (prices[i+1] - prices[i] > 0) {
                max += prices[i+1] - prices[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        _122ytt test = new _122ytt();
        int[] prices = new int[]{1,2,3,4,5};
        System.out.println(test.maxProfit(prices));
    }
}
