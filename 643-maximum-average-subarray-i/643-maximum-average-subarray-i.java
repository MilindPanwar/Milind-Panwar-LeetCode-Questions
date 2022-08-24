class Solution {

    public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 1) {
            return (double) nums[0];
        }
        double sum = 0;
        double max = Double.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = (double) (sum / k);
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum / k);
        }
        return max;
    }
}
