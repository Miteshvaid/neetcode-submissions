class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrices = prices[0];
        int maxProfit = 0;

        for(int i = 0; i < n; i++){
            minPrices = Math.min(minPrices, prices[i]);
           int profit = prices[i] - minPrices;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}
