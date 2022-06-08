class Solution {

    public int majorityElement(int[] nums) {
        int c = 0;
        int el = 0;
        for (int i = 0; i < nums.length; i++) {
            //if c=0 then the next [i] will be assigned to el
            if (c == 0) {
                el = nums[i];
            }
            //if encounter same number
            if (el == nums[i]) {
                c++;
            }
            //if encounter new number
            else {
                c--;
            }
        } //el is the only element left which was not cancelled by any other number
        return el;
    }
}
