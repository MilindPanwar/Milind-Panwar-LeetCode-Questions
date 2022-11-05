class Solution {

    public void moveZeroes(int[] nums) {
        int z = 0;
        int p = 0;
        while (z < nums.length && p < nums.length) {
            while (z < nums.length && nums[z] != 0) {
                z++;
            }
            p=z;
            while (p < nums.length && nums[p] == 0) {
                p++;
            }
            if (z < nums.length && p < nums.length) {
                nums[z] = nums[p];
                nums[p]=0;
                z =z+1;
            }
        }
    }
}
