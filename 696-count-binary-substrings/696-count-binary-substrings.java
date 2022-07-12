class Solution {

    public int countBinarySubstrings(String s) {
        int count = 0, prev = 0, i = 1, curr = 1;
        while (i < s.length()) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                count += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            } else {
                curr++;
            }
            i++;
        }
        return count += Math.min(prev, curr);
    }
}
