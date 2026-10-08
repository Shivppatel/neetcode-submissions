class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lastPrice = prices[0];
        for(int idx = 1; idx < prices.length; idx++){
            if (lastPrice < prices[idx]){
                maxProfit += prices[idx] - lastPrice;
            }
            lastPrice = prices[idx];
        }
        return maxProfit;
    }
}