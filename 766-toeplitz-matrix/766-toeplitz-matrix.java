class Solution {

    public boolean isToeplitzMatrix(int[][] m) {
        
        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j<m[0].length; j++) {
                if (m[i][j] != m[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
