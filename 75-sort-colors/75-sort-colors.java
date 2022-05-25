class Solution {
    public void sortColors(int[] nums) {
        int n1=0;
        int n2=0;
        int n3=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                n1++;
            }
            if(nums[i]==1){
                n2++;
            }
            if(nums[i]==2){
                n3++;
            }
        }
        int n=0;
        for(int i=0;i<n1;i++){
            nums[i]=0;
            n++;
        }
        for(int i=0;i<n2;i++){
            nums[n]=1;
            n++;
        }
        for(int i=0;i<n3;i++){
            nums[n]=2;
            n++;
        }
    }
}