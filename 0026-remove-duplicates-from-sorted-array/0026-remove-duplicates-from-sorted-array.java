class Solution {

    public int removeDuplicates(int[] nums) {
        int p1 = 0;
        int p2 = 1;
        while (p1<nums.length && p2 < nums.length) {
            while (p2 < nums.length  && nums[p1] == nums[p2]) {
                p2++;
            }
            if(p2>=nums.length){
                break;
            }
            p1++;
            nums[p1] = nums[p2];
            if(p2==nums.length-1){
                break;
            }
            
        }
        return ++p1;
    }
}
