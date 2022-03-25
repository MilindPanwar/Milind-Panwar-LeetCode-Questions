class Solution {

    public void setZeroes(int[][] matrix) {
        int col0 = 1, row = matrix.length, col = matrix[0].length;

        for (int i = 0; i < row; i++) {
            //if matrix[0][0] is 0 then put col0 as false
            if (matrix[i][0] == 0) {
                col0 = 0;
            }
            for (int j = 1; j < col; j++) {
                //if element at that i j index is 0
                if (matrix[i][j] == 0) {
                    //assign leftmost as 0
                    matrix[i][0] = 0;
                    //assign topmost as 0
                    matrix[0][j] = 0;
                }
            }
        }
        //traversing from back
        for (int i = row - 1; i >= 0; i--) {
            //traversing till j>=1
            for (int j = col - 1; j >= 1; j--) {
                //if leftmost and topmost is 0
                if (matrix[i][0] == 0 || matrix[0][j]==0) {
                    //assign i j element as 0
                    matrix[i][j] = 0;
                }
            }
            //if col0 is false
            if (col0 == 0) {
                //assign zero for all columns of i row
                matrix[i][0] = 0;
            }
        }
    }
}
