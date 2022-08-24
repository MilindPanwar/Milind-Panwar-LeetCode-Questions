class Solution {

    public boolean checkPossibility(int[] nums) {
        int modi = 0;

        //loop 1 se chalega kyuki n-1 bhi check karenge
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                if (modi == 1) { //mod agar 1 hua to return kardo false
                    return false;
                }
                modi++;
                //MOST IMPORTANT
                //i<2 kyuki loop 1 se end tak chalraha hai
                //aur if statement mei bas nums[i-2]<=nums[i] nahi rakhsakte
                //kyuki nums[i-2] out of bound hojaega 2 se chote i ke liye (i<2)
                if (i < 2 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i]; //agar nums[i] se left mei doosra element chota hai
                } else {
                    nums[i] = nums[i - 1]; //agar nums[i] se left mei doosra element bada hai
                }
            }
        }

        //yaha tak agya code matlab array non-decreasing hosakta hai
        return true;
    }
}
