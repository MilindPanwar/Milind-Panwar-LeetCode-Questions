class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                p1++;
                if (p2 < p1) {
                    p2 = p1;
                }
            }else {
                p1=0;
            }
        }
        return p2;
    }
}
