class Solution {

    public int minDistance(String w1, String w2) {
    
        int n = w1.length();
        int m = w2.length();

        int[][] dp = new int[n][m];
        for (int rows[] : dp) {
            Arrays.fill(rows, -1);
        }

        int l= helper(w1, w2, w1.length()-1, w2.length()-1, dp);
        return w1.length()+w2.length()-2*l;
    }

    public static int helper(String s1, String s2, int in1, int in2, int[][] dp) {
        if (in1 < 0 || in2 < 0) {
            return 0;
        }
        if (dp[in1][in2] != -1) {
            return dp[in1][in2];
        }
        if (s1.charAt(in1) == s2.charAt(in2)) {
            return dp[in1][in2] = 1 + helper(s1, s2, in1 - 1, in2 - 1, dp);
        } else {
            return dp[in1][in2] = 0 + Math.max(helper(s1, s2, in1 - 1, in2, dp), helper(s1, s2, in1, in2 - 1, dp));
        }
    }
}
