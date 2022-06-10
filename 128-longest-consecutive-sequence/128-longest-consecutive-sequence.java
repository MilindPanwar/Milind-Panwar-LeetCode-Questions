class Solution {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        
        int ans = 1;
        int prev = nums[0];
        int curr=1;

        for (int i = 1; i < nums.length; i++) {
            if(prev+1==nums[i]){
                curr++;
            }else if(prev!=nums[i]){
                curr=1;
            }
            prev=nums[i];
            ans=Math.max(curr, ans);
        }
        return ans;
    }
}
