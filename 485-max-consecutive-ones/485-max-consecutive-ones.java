class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c++;
            }
            if (max < c) {
                max = c;
            }
            if (nums[i] != 1) {
                c = 0;
            }
        }
        return max;
    }
}
