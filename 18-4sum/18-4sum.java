class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            int t3 = target - nums[i];
            for (int j = i + 1; j < n; j++) {
                int t2 = t3 - nums[j];
                int front = j + 1;
                int back = nums.length - 1;

                while (front < back) {
                    int twosum = nums[front] + nums[back];
                    if (twosum < t2) {
                        front++;
                    } else if (twosum > t2) {
                        back--;
                    } else {
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[front]);
                        l.add(nums[back]);
                        res.add(l);
                        while (front < back && nums[front] == l.get(2)) {
                            ++front;
                        }
                        while (front < back && nums[back] == l.get(3)) {
                            --back;
                        }
                    }
                }
                while (j + 1 < n && nums[j + 1] == nums[j]) ++j;
            }
            while (i + 1 < n && nums[i + 1] == nums[i]) ++i;
        }
        return res;
    }
}
