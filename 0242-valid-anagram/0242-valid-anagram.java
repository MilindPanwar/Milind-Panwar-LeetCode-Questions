class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] c = new char[26];
        
        for (int i = 0; i < s.length(); i++) {
            c[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if (c[t.charAt(i) - 'a'] > 0) {
                c[t.charAt(i) - 'a']--;
            } else {
                return false;
            }
        }
        return true;
    }
}
