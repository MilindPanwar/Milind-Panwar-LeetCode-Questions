class Solution {

    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return k;
        }
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        int count = 0;
        while (right < nums.length) {
            if (nums[right] - nums[left] > k) {
                left++;
            } else if (nums[right] - nums[left] < k || right == left) {
                right++;
            } else {
                right++;
                left++;
                count++;
                while (right < nums.length && nums[right] == nums[right - 1]) {
                    right++;
                }
            }
        }
        return count;
    }
}
