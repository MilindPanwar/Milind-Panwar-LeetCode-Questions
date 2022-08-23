class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length; //row ki length
        int n = mat[0].length; //column ki length

        if (m * n != r * c) {
            return mat; // original matrix aur new matrix ke pas same number of elements nahi hain to return karvado original matrix ( as per question, read paragraph 4)
        }

        int total_Elements = r * c; //total elements in new matrix

        int[][] result = new int[r][c];
        for (int i = 0; i < total_Elements; i++) { //0 se total_Elements tak loop
            //MOST IMPORTANT LOGIC HERE : Mod wala logic pen aur paper lekar khudse calculate karo, har iteration ke liye MOD aur DIVIDE kaise horaha hai ye paper pe calculate karke dekho TAB HI SAMAJH AYEGA!

            result[i / c][i % c] = mat[i / n][i % n];
            // Firbhi Nahi Samajh aaye to DM karo LinkedIn ya Instagram pe.. @MilindPanwar

        }
        return result;
    }
}
