class Solution {

    public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for (Integer n : nums) {
//if element repears then continue--->
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) {
                continue;
            }
//if max1 is null or lesser than n, put max2 in max max3 and max1 in max2 and n in max1
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
//if max2 is null or lesser than n, put max2 in max3 and n in max2
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
//if max3 is null or lesser than n, put n in max3
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
//if max3 is still null, return max1
        if (max3 == null) {
            return max1;
        } else 
//if max3 has a value then, return max3
            return max3;
    }
}
