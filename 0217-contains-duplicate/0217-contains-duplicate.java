class Solution {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            if (set.contains(val)) {
                return true;
            } else {
                set.add(val);
            }
        }
        return false;
    }
}
