class Solution {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int val : nums) {
            if (i == 0 || val > nums[i-1]) {
                nums[i] = val;
                i++;
            }
        }
        return i;
    }
}
