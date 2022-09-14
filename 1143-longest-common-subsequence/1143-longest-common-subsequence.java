class Solution {

    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n][m];
        for (int rows[] : dp) Arrays.fill(rows, -1);
        return helper(text1, text2, n-1, m-1, dp);
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
