class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat; //as per a rule given in question
        }

        int[][] rc = new int[r][c];
        int row = 0; // new counter for row updation 
        int column = 0; // new counter for column updation
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                
                rc[row][column] = mat[i][j];
                
                column++; 
                if (column == c) { //if counter column reaches end of row
                    row++; //update row by 1
                    column = 0; //set column to 0 
                }
            }
        }
        return rc;
    }
}
