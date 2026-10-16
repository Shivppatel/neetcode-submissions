class Solution {
    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        for (int price: prices){
            minBuy = Math.min(price, minBuy);
            maxProfit = Math.max(maxProfit, price - minBuy);
        }
        return maxProfit;
    }
}
