class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int i = m + n - 1;
//while terminates when p2 is lesser than zero
        while (p2 >= 0) {
            
//if executes till p1 is greater or equal to zero
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
//if p1 is greater than p2
                nums1[i] = nums1[p1];
                p1--;
                i--;
            } else {
//if p2 is greater than p1
                nums1[i] = nums2[p2];
                p2--;
                i--;
            }
        }
    }
}
