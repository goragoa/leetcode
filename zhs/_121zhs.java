public class _121zhs {
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        int[] profit = new int[prices.length - 1];
        for (int i = 0; i < prices.length - 1; i++) {
            profit[i] = prices[i + 1] - prices[i];
        }
        int maxProfit = 0;
        int value = 0;
        for (int p : profit) {
            if (value < 0)
                value = 0;
            value = value + p;
            maxProfit = Math.max(maxProfit, value);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        _121zhs t = new _121zhs();
        System.out.println(t.maxProfit(new int[] {}));
    }
}
