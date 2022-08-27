class Solution {

    public int[] fairCandySwap(int[] a, int[] b) {
        HashSet<Integer> hs = new HashSet();
        int sum_a = 0;
        for (int i : a) {
            sum_a += i;
            hs.add(i);
        }

        int sum_b = 0;
        for (int i : b) {
            sum_b += i;
        }

        int diff = (sum_a - sum_b) / 2;

        for (int i : b) {
            int target = i + diff;
            if (hs.contains(target)) {
                return new int[] { target, i };
            }
        }
        return null;
    }
}
