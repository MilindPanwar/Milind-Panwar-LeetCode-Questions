class Solution {

    public int maximumProduct(int[] nums) {
        
        //array sort karlo, taaki badi values end mei chali jae
        Arrays.sort(nums);
        
        //array ka size daldo ek variable mei, easy hoga aage ke liye
        int n=nums.length;
        
        //agar array ki sari values positive hai
        int p = nums[n-3]*nums[n-2]*nums[n-1]; 
        
        //agar array mein negative values bhi hai
        //negative values hai to aage se do utha lenge
        //kyuki negative hai to aage ki do values sabse badi 
        //aur fir ek last ki sabse badi
        int q= nums[0]*nums[1]*nums[n-1];
        
        
        //p aur q mei se jo bada hai usko lauta do
        return Math.max(p,q);
    }
}
