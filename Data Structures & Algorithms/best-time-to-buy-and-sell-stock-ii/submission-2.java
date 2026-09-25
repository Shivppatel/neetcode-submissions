class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lastPrice = prices[0];
        for(int price: prices){
            if (lastPrice < price){
                maxProfit += price - lastPrice;
            }
            lastPrice = price;
        }
        return maxProfit;
    }
}