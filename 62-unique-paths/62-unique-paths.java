class Solution {

    public int uniquePaths(int m1, int n1) {
        int[][] arr=new int[m1+1][n1+1];
        for(int i=0;i<m1;i++){
            for(int j=0;j<n1;j++){
                arr[i][j]=-1;
            }
        }
        int n = cp(0, 0, m1, n1,arr);
        return n;
    }

    int cp(int i, int j, int m, int n,int[][] dp) {
        if (i == (m - 1) || j == (n - 1)) {
            return 1;
        }
        if (i >= m || j >= n) {
            return 0;
        } 
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        else{
            return dp[i][j]=cp(i + 1, j, m, n,dp) + cp(i, j + 1, m, n,dp);
        }
    }
}
