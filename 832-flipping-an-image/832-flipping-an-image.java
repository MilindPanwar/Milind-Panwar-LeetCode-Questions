class Solution {

    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            reverse(i, image);
        }
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image.length; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                } else {
                    image[i][j] = 1;
                }
            }
        }
        return image;
    }

    public void reverse(int i, int[][] image) {
        int s = 0;
        int e = image[0].length - 1;
        while (s < e) {
            int temp = image[i][s];
            image[i][s] = image[i][e];
            image[i][e] = temp;
            s++;
            e--;
        }
    }
}
