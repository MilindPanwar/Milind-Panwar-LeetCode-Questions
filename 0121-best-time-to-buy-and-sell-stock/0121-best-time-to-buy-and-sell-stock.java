class Solution {

    public int maxProfit(int[] p) {
        int lsf = Integer.MAX_VALUE;
        int max = 0;
        int sold = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] < lsf) {
                lsf = p[i];
            }
            sold = p[i] - lsf;
            if (sold > max) {
                max = sold;
            }
        }
        return max;
    }
}
