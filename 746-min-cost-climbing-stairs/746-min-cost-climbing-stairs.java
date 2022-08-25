class Solution {

    public int minCostClimbingStairs(int[] cost) {
            // 2 se shuru kiya kyunki cost[i-1] aur cost[i-2] karna hai
        for (int i = 2; i < cost.length; i++) {
            //cost[i] bharte chale jaenge hum
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
            //agar i-1 ya i-2 chota hai to current index pe usko store kardo array mein
            //aese minimum element end tak store hojaega
            
        }
        
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }
}
