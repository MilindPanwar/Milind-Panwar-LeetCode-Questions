class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
//length of row
        int m = mat.length;
//length of column
        int n = mat[0].length;
//if dimensions are not equal then
        if(m*n!=r*c){
            return mat;
        }
//new array for reshaped array
        int[][] arr = new int[r][c];
//loop till new array dimension which is r into c
        for (int i = 0; i < r * c; i++) {
// i/c because it makes 1 row as a result
// i%c because it makes
            arr[i / c][i % c] = mat[i / n][i % n];
        }
        return arr;
    }
}
