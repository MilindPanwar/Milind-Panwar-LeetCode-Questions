class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); //sorting the array is important
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) { //till 3rd last index
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { //checking/skipping duplicate n[i]
                int lo = i + 1, hi = nums.length - 1, sum = 0 - nums[i];
                while (lo < hi) {
                    if (nums[lo] + nums[hi] == sum) {
                        result.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) lo++; //skipping duplicate lo
                        while (lo < hi && nums[hi] == nums[hi -1]) hi--; //skipping duplicate hi
                        hi--;
                        lo++;
                    } else if (nums[lo] + nums[hi] < sum) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        return result;
    }
}
