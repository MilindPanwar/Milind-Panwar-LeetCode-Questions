class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat; // Question mein ye rule diya hua hai 4th paragraph mein - "If the ...Otherwise, output the original matrix."
        }

        int[][] rc = new int[r][c];
        int row = 0; // naya variable row ke liye
        int column = 0; // naya variable column ke liye

        //ek simple nested for loop original matrix mein traverse karne ke liye
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rc[row][column] = mat[i][j]; // value assign kardo

                column++;
                if (column == c) { //agar column variable row ke last column pe hai to "if" ke andar ghusjaega code
                    row++; //row ko 1 se bada do taki next row ke traverse karsake hum
                    column = 0; // column ko 0 set kardo taki nayi row ke 0 index se shuru ho naya traversal
                }
            }
        }
        return rc; // return kardo apna "rc" naam ka array
    }
}
//badhai ho aapne successfully ye code karlia hai, Jai Mata Di...
