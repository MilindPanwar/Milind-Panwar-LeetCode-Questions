class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int sum=1;
        int max=1;
        for(int i=1; i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                sum++;
                if(sum>max){
                    max=sum;
                    
                }else max=max;
            }else sum=1;
        }
        return max;
        
    }
}