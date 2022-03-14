class Solution {

    public int pivotIndex(int[] nums) {
        if (nums.length == 1) return 1; //length is 1, index is 1, so return 1

        int tsum = 0; // calculating total sum of array
        for (int i = 0; i < nums.length; i++) {
            tsum += nums[i];
        }

        int lsum = 0;
        for (int i = 0; i < nums.length; i++) {
            tsum = tsum - nums[i]; //right sum
            if (tsum == lsum) return i; //if lsum=rsum return the index
            lsum = lsum + nums[i]; //left sum
        }
        //if no index exist return -1
        return -1;
    }
}
