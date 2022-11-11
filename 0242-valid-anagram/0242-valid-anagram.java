class Solution {

    public boolean isAnagram(String s, String t) {
        int[] az = new int[26];
        for (int i = 0; i < s.length(); i++) az[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) az[t.charAt(i) - 'a']--;

        for (int i : az) if (i != 0) return false;
        return true;
    }
}
