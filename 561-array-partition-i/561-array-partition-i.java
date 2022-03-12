class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result=0;
//incrementing i+=2 everytime
//it takes 2nd element every time and adds into result
        for(int i=0; i<nums.length;i+=2){
            result+=nums[i];
        }
        return result;
    }
}