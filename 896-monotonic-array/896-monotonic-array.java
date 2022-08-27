class Solution {

    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1 || nums.length == 2) {
            return true;
        }
        
        int j = 0;
        if (nums[0] == nums[1]) {
            while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                j++;
            }
        }
        int c1 = 0;
        if (j < nums.length - 1 && nums[j] < nums[j + 1]) {
            c1++;
        }
        if (c1 > 0) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    continue;
                }
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {
                    continue;
                }
                if (nums[i] < nums[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
