class Solution {

    public int[] sortArrayByParityII(int[] nums) {
        int p = 1;//1 se shuru matlab odd ke liye
        for (int i = 0; i < nums.length; i += 2) { //0 se shuru matlab even ke liye
            //increment bhi har baar +2 karke hoga kyuki even ke liye h
            
            //ye odd index pe hi chalega humesha
            //odd index pe even value aye to wahan break hojaega
            while (p < nums.length && nums[p] % 2 == 1) {
                p += 2;//+2 kar rahe hai kyuki 1 se shuru hua hai
                // "p" odd tha aur odd hi rahega
            }//odd index pe even value mile to ye rukjaega aur
            // j mei odd index store kardega jisme even value hai
            
            if (nums[i] % 2 == 1) {//even index pe odd value mile to 
                
                //nums[i] even index & odd value
                //nums[p] odd index & even value
                
                //in dono ko swap kardo, bas yahi to karna hai
                int temp = nums[i];
                nums[i] = nums[p];
                nums[p] = temp;
                p = p + 2;
            }
        }
        //return karvado aur mauj karo
        return nums;
    }
}
