class Solution {
    public int maxProfit(int[] prices) {
        int sum=0;
        int max=0;
//used kadane's algorithm
        
        for(int i=1; i<prices.length;i++){
//adding in sum
            sum+=prices[i]-prices[i-1];
//if sum is lesser than 0 then sum=0 else sum remains same.
            if(sum<0){
                sum=0;
            }
//updating max value if it is lesser than sum
            if(sum>max){
                max=sum;
            }
        }
        return max;
        
    }
}