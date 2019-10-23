package study.leetcode;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        if (null == prices || prices.length <= 0) {
            return maxProfit;
        }
        for (int i = 0; i < prices.length; i++) {
            int temp = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int temp2 = prices[j];
                if ((temp2 - temp) > maxProfit) {
                    maxProfit = temp2 - temp;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(array));
    }
}
