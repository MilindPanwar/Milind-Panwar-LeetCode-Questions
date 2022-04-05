class Solution {

    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int ans = 0;
        while (start < end) {
            //smallest from start end end 
            //then multiplying it with area
            //then comparing area answer from min value with old ans
            //taking max value 
            ans = Math.max(Math.min(height[start], height[end])*(end-start), ans);
            if (height[start] <= height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return ans;
    }
}
