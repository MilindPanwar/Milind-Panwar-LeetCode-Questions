class Solution {

    public int findNumbers(int[] nums) {
        int countofdigits = 0;
        int evennum = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            while (num > 0) {
                int rem = num % 10;
                countofdigits++;
                num = num / 10;
            }

            if (countofdigits % 2 == 0) evennum++;
            countofdigits=0;
        }
        
        return evennum;
    }
}
