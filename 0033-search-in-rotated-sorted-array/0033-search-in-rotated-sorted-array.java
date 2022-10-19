class Solution {
    public int search(int[] nums, int target) {
        int smal=Integer.MAX_VALUE;
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<smal){
                ind=i;
                smal=nums[i];
            }
        }
        int a=bs(nums, ind, nums.length-1,target);
        int b=bs(nums, 0,ind-1,target);
        if(a==-1 && b==-1){
            return -1;
        }else if(a>-1){
            return a;
        }else{
            return b;
        }
    }
    public int bs(int[] nums, int s, int e,int target){
        while(s <= e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(target<nums[mid]){
                e=mid-1;
            }
            if(target>nums[mid]){
                s=mid+1;
            }
        }
        return -1;
    }
}