// Say you have an array for which the ith element is the price of a given stock on day i.

// If you were only permitted to complete at most one transaction 
// (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.


    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0){
            return 0;
        }
        
        int minPrice = prices[0];
        int maxProfitTillNow = 0;
        int profit = 0;
        
        for(int i = 0; i < prices.length; i++){
            // Every time calculate max profit with current price and min price. Update min price for further calculation

            profit = prices[i] - minPrice;
            maxProfitTillNow = Math.max(profit, maxProfitTillNow);
            minPrice = Math.min(prices[i], minPrice);
        }
        
        return (maxProfitTillNow > 0)? maxProfitTillNow:0;
    }