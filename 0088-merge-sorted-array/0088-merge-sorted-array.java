class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int c = nums1.length - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[c] = nums1[p1];
                p1--;
                c--;
            } else {
                nums1[c] = nums2[p2];
                p2--;
                c--;
            }
        }
        while (p2 >= 0) {
            nums1[c] = nums2[p2];
            p2--;
            c--;
        }
    }
}
