class Solution {

    public int[] sumEvenAfterQueries(int[] nums, int[][] q) {
        int sum=0;
        for (int a : nums) {
            if (a % 2 == 0) {
                sum += a;
            } else sum += 0;
        }
        int[] arr = new int[q.length];

        for (int i = 0; i < q.length; i++) {
            int ind = q[i][1];
            if (nums[ind] % 2 == 0) {
                sum -= nums[ind];
            }
            nums[ind] += q[i][0];
            if (nums[ind] % 2 == 0) {
                sum += nums[ind];
            }
            arr[i] = sum;
        }
        return arr;
    }
}
