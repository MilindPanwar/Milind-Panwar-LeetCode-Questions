class Solution {

    public void nextPermutation(int[] nums) {
        if (nums.length <= 1 || nums == null) {
            return;
        }
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) { //i will be zero or in minus if no breakpoint is found
            int j = nums.length - 1;
            while (nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }

        rev(nums, i + 1, nums.length - 1);
    }

    public void swap(int[] nums, int ind1, int ind2) {
        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;
    }

    public void rev(int[] nums, int ind1, int ind2) {
        while (ind1 < ind2) {
            int temp = nums[ind1];
            nums[ind1] = nums[ind2];
            nums[ind2] = temp;
            ind1++;
            ind2--;
        }
    }
}
