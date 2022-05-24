class Solution {

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int col0 = 1; //for matrix[0][0]

        for (int i = 0; i < row; i++) {
            if (matrix[i][0] == 0) col0 = 0; //if col=0 in any row, set col0=0;
            for (int j = 1; j < col; j++) {
                //starting from the second col, as operatn for first col has been done.
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0; //set topmost 0
                    matrix[i][0] = 0; //set leftmost 0
                }
            }
        }
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 1; j--) {
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0; //set current element 0
                }
            }
            if (col0 == 0) { //operation for mat[0][0]
                matrix[i][0] = 0; //if any first col was 0, then mat00 is set to 0
            }
        }
    }
}
