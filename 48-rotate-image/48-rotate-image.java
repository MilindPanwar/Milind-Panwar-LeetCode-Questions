class Solution {

    public void rotate(int[][] matrix) {
        int[][] dm = new int[matrix.length][matrix.length];
        int len = matrix.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                dm[j][len- i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                matrix[i][j]=dm[i][j];
            }
        }
        
    }
}
