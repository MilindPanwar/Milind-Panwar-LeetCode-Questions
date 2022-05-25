class Solution {

    public int maxProfit(int[] p) {
        int min = Integer.MAX_VALUE;
        int prof = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] < min) {
                min = p[i];
            }
            if ((p[i] - min) > prof) {
                prof = p[i] - min;
            }
        }
        return prof;
    }
}
