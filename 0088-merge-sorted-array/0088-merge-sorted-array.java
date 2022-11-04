class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=nums1.length-1;
        for(int i=nums2.length-1;i>=0;i--){
            nums1[j]=nums2[i];
            j--;
        }
        Arrays.sort(nums1);
    }
}