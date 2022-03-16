class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        int n = cost.length;
        for (int i = 2; i < cost.length; i++) {
            //dp[i-1] means i-1th element
            //dp[i-2] means i-2th element
            //cost[i] means the current element on which we are now
            //calculating the minimum of these and storing in dp[i]
            dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
        }
        //returning the minimum value
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
