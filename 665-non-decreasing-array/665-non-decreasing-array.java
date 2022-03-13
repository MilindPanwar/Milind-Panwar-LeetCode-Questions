class Solution {

    public boolean checkPossibility(int[] nums) {
        int count = 0;
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                k = i;
            }
        }
        if (count == 0) {
            return true;
        }
        if (count > 1) {
            return false;
        }
        if (k == 1 || k == nums.length - 1) {
            return true;
        }
        if (nums[k + 1] < nums[k - 1] && nums[k] < nums[k - 2]) {
            return false;
        }
        return true;
    }
}
