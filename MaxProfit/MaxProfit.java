// package MaxProfit;

public class MaxProfit {
    static class Solution {
        public int maxProfit(int[] prices) {
            int maxProfit = 0;
            int maxFuturePrice = 0;  // Holds the highest price seen from the right
            
            // Traverse prices array from right to left
            for (int i = prices.length - 1; i >= 0; i--) {
                maxFuturePrice = Math.max(maxFuturePrice, prices[i]);
                maxProfit = Math.max(maxProfit, maxFuturePrice - prices[i]);
            }
            return maxProfit;
        }
    }
    
    public static void main(String[] args) {
        // Example usage of maxProfit method
        int[] prices = {7, 1, 5, 3, 6, 4};
        Solution sol = new Solution();
        int maxProfit = sol.maxProfit(prices);
        System.out.println(maxProfit);
    }
}
