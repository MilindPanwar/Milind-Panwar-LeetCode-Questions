class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        // loop till k to find first 3 elements of window
        for(int i=0; i<k;i++){
            sum= sum+nums[i];
        }
        // storing sum in max
        int max= sum;
        // loop from k to <length
        for(int i=k;i<nums.length;i++){
            //adding current element to window
            sum=sum+nums[i];
            //subtracting first element from window
            sum=sum-nums[i-k];
            max= Math.max(max,sum);
        }
        // returning a double value
        return (max*1.0)/k;
        
    }
}