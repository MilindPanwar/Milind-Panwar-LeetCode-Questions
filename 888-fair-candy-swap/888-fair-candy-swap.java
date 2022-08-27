class Solution {

    public int[] fairCandySwap(int[] a, int[] b) {
        int tsum1 = 0;
        int tsum2 = 0;
        for (int i : a) {
            tsum1 += i;
        }
        for (int i : b) {
            tsum2 += i;
        }
        
        int s1 = 0;
        int s2 = 0;
        int[] arr = new int[2];

        for (int i=0; i < a.length; i++) {
            for (int j=0; j < b.length; j++) {
                s1 = b[j] + tsum1 - a[i];
                s2 = a[i] + tsum2 - b[j];
                if (s1 == s2) {
                    arr[0] = a[i];
                    arr[1] = b[j];
                    break;
                }
            }
        }
        return arr;
    }
}
