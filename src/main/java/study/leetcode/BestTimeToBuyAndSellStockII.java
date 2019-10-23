package study.leetcode;

public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if(null != prices && prices.length > 1) {
            int temp0 = prices[0];
            for(int i = 1; i < prices.length; i++) {
                int temp1 = prices[i];
                if(temp1 > temp0) {
                    maxProfit += temp1 - temp0;
                }
                temp0 = temp1;
            }
        }
        return maxProfit;
    }
}