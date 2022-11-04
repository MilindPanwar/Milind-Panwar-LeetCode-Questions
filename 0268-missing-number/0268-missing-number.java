class Solution {

    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int v : nums){
            set.add(v);
        }
        int n=nums.length;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}
