class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                // if i is starting index, put pre=0
                // if index-1, which is if previous index is zero
                // put zero else one
                int pre = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
                // if i is ending index, put nex=0;
                // if index+1, which is if next index is zero
                // put zero else one
                int nex = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1;
                // if pre and nex both are zero that means we can plant here
                // planting means incrementing count by one
                if (pre == 0 && nex == 0) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        // if count is greater or equal to n
        // return true else false
        return count >= n;
    }
}
