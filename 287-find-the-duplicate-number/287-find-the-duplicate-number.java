class Solution {
    public int findDuplicate(int[] nums) {
        
        int[] arr=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]+=1;
        }
        int ind=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=2){
                ind=i;
            }
                    }
        return ind;
    }
}