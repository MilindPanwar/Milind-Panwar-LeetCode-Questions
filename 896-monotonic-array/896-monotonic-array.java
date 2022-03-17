class Solution {

    public boolean isMonotonic(int[] nums) {
        int a = nums.length;
        int b = nums.length;
        if (nums.length == 1) {
            return true;
        }
        if (nums[0] <= nums[1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] <= nums[i + 1]) {
                    a--;
                    if (a == 1) {
                        return true;
                    }
                }
            }
        }
        if (nums[0] >= nums[1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] >= nums[i + 1]) {
                    b--;
                    if (b == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
