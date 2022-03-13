class Solution {

    public int findUnsortedSubarray(int[] nums) {
        // finding end point of subarray
        int end = -1;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max > nums[i]) {
                end = i;
            } else max = nums[i];
        }
        // finding start point of subarray
        int st = 0;
        int min = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            if (min < nums[i]) {
                st = i;
            } else min = nums[i];
        }
        return end - st + 1;
    }
}
