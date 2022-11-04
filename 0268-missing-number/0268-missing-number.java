class Solution {

    public int missingNumber(int[] nums) {
        // if(nums.length==2){
        //     if(nums[0]==1 || nums[1]==1){
        //         return 2;
        //     }else{
        //         return 1;
        //     }
        // }
        if(nums.length==1 && nums[0]==0){
            return 1;
        }
        Arrays.sort(nums);
        int n = nums.length;
        
        for (int i = 0; i <n; i++) {
            if (nums[i] != i) {
                return i;
            }
            
        }
        return n;
    }
}
