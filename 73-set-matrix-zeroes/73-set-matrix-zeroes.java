
class Solution {

    public void setZeroes(int[][] m) {
        int[][] d1 = new int[1][m[0].length];
        int[][] d2 = new int[m.length][1];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0;j< m[0].length; j++) {
                if (m[i][j] == 0) {
                    d1[0][j] = -1;
                    d2[i][0] = -1;
                }
            }
        }

        for (int i = 0; i<m.length; i++) {
            for (int j = 0;j< m[0].length; j++) {
                if (d1[0][j] == -1 || d2[i][0] == -1) {
                    m[i][j] = 0;
                }
            }
        }
    }
}



