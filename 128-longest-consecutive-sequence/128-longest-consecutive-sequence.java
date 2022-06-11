class Solution {

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int streak = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int j = num;
                int cstreak = 1;
                while (set.contains(j + 1)) {
                    cstreak++;
                    j++;
                }
                streak = Math.max(streak, cstreak);
            }
        }
        return streak;
    }
}
