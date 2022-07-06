class Solution {

    public boolean checkRecord(String s) {
        int a = 0;
        int l = 0;
        int p = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'P') {
                p++;
            }
            if (s.charAt(i) == 'A') {
                a++;
                if (a >1) {
                    return false;
                }
            }
            if (s.charAt(i) == 'L' && i < s.length() - 2) {
                if (s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
                    return false;
                }
            }
        }
        return true;
    }
}
