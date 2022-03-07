class Solution {

    public int maxProfit(int[] prices) {
        int sum = 0;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
//sum+=Math.max(0,prices[i]-prices[i-1]);
            sum = prices[i] - prices[i - 1];
            if (sum < 0) {
//if loss then max+0
                max += 0;
            } else 
//if profit then max+sum
                max += sum;
        }
        return max;
    }
}
