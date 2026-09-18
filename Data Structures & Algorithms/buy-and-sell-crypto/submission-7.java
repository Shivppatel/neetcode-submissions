class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuy = prices[0];
        for(int price: prices){
            int profit = price - minBuy;
            maxProfit = Math.max(profit, maxProfit);
            minBuy = Math.min(price, minBuy);
        }
        return maxProfit;
    }
}
