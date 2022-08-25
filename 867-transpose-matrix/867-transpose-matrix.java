class Solution {

    public int[][] transpose(int[][] m) {
        int[][] temp = new int[m[0].length][m.length];
        int r=m.length;
        int c=m[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                temp[j][i] = m[i][j];
            }
        }
        return temp;
    }
}
