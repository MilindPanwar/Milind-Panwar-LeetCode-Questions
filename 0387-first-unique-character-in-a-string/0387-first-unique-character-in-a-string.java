class Solution {

    public int firstUniqChar(String s) {
        int[] ltrs = new int[26];
        char[] schar = s.toCharArray();
        for (char c : schar) {
            ltrs[c - 'a']++;
        }
        for (int i = 0; i < schar.length; i++) {
            if (ltrs[schar[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
