public class _122zhs {
    public int maxProfit(int[] prices) {
        int[] profit = new int[prices.length - 1];
        for (int i = 0; i < prices.length - 1; i++) {
            profit[i] = prices[i + 1] - prices[i];
        }
        int maxProfit = 0;
        for (int p : profit) {
            if (p > 0)
                maxProfit += p;
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        _122zhs t = new _122zhs();
        System.out.println(t.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
    }
}
