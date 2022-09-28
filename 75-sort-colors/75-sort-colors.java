class Solution {
    public void sortColors(int[] nums) {
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a++;
            }
            if(nums[i]==1){
                b++;
            }
            if(nums[i]==2){
                c++;
            }
        }
        int n=0;
        for(int i=0;i<a;i++){
            nums[n]=0;
            n++;
        }
        for(int i=0;i<b;i++){
            nums[n]=1;
            n++;
        }
        for(int i=0;i<c;i++){
            nums[n]=2;
            n++;
        }
        
    }
}