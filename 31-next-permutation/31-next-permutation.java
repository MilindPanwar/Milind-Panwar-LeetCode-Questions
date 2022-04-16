class Solution {

    public void nextPermutation(int[] nums) {
        //i is end last element as i+1 will go out of bound
        int i = nums.length - 2;
        //j is last element
        int j = nums.length - 1;
        if (nums == null || nums.length <= 1) {
            return;
        }
        
        //setting up the index for i
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        //if i=0 do this work or else just reverse it
        //if i!=0 that means array just need to be reversed
        if (i >= 0) {
            //setting up the index for j
            while (nums[j] <= nums[i]) {
                j--;
            }
            //swapping i and j
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        //st=i+1 because reversing from the next index of i
        int st = i+1;
        int en = nums.length - 1;
        while (st <= en) {
            int tempo = nums[st];
            nums[st] = nums[en];
            nums[en] = tempo;
            st++;
            en--;
        }
    }
}
