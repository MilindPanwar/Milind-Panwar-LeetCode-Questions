class Solution {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int p1 = nums[0];
        int f = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[0] != 0 && nums.length == nums[nums.length-1]) {
                return 0;
            }
            if (p1 != nums[i]) {
                f = p1;
            } else {
                p1++;
            }
        }
        return p1;
    }
}
