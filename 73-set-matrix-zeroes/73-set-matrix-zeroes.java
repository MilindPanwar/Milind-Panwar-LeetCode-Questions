class Solution {

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] up = new int[1][col];
        int[][] left = new int[row][1];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    up[0][j] = -1;
                    left[i][0] = -1;
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (up[0][j]==-1 || left[i][0]==-1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
