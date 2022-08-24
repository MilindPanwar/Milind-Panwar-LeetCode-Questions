class Solution {

    public int findLengthOfLCIS(int[] nums) {
        int max = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] < nums[i]) {
                c++;
                if (max < c) {
                    max = c;
                }
            } else {
                c = 1;
            }
        }
        return max;
    }
}
