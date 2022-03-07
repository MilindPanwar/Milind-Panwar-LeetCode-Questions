class Solution {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 1;
        int val = 0;
        if(n==1){
            val=nums[0];
            return val;
        }
        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > n / 2) {
                val = nums[i];
            }
           
        }
        return val;
    }
}
