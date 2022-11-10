class Solution {

    public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;

        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            int lastIndex = s.lastIndexOf(c);

            if (index != -1 && index == lastIndex) {
                ans = Math.min(ans, index);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
