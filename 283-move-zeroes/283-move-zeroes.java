class Solution {
    public void moveZeroes(int[] nums) {
        int p1=0;
        for(int i=1; i< nums.length;i++){
            if(nums[p1]!=0){
                p1++;
            }else if(nums[i]!=0){
                nums[p1]=nums[i];
                p1++;
                nums[i]=0;
            }
        }
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("]");
        
    }
}