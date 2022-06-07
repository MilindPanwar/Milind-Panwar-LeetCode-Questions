class Solution {

    public void rotate(int[][] matrix) {
        //Transpose the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                //starting j=i, now it will ignore diagonal values
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //Reverse each row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                //matrix.length-1-j allows us to traverse from the back
                //when j is 0 = its value is 4
                //when j is 1 = its value is 3
                //goes till matrix.length/2 so values are not swapped again
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}
