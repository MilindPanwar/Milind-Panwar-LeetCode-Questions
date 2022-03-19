class Solution {

    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int in = nums.length - 1;
        int[] result = new int[nums.length];
        while (l <= r) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                result[in] = nums[l] * nums[l];
                l++;
            } else {
                result[in] = nums[r] * nums[r];
                r--;
            }
            in--;
        }
        return result;
    }
}
