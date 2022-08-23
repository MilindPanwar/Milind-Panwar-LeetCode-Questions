class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int low=0;
        int hi=nums.length-1;
        
        while(low+1<nums.length && nums[low]<=nums[low+1]){
            low++; //finding the breakpoint or the "start" index of subbarray
        }
        while(hi-1>0 && nums[hi]>=nums[hi-1]){
            hi--; //finding the breakpoint or the "end" index of subbarray
        }
        if(low==nums.length-1){//iska matlab, Poora array sorted hai.
            return 0; 
        }
        int subMin= Integer.MAX_VALUE;
        int subMax= Integer.MIN_VALUE;
        for(int i=low;i<=hi;i++){
            subMin=Math.min(subMin, nums[i]); //subaray mein min element
            subMax=Math.max(subMax, nums[i]); //subarray mein max element
        }
        while(low-1>=0 && nums[low-1]>subMin){ //low se 0 tak jaega
            low--; 
        }
        while(hi+1<=nums.length-1 && nums[hi+1]<subMax){ //hi se end tak jaega
            hi++;
        }
        return hi-low+1; //indexing 0 se hai islie plus 1
        
    }
}