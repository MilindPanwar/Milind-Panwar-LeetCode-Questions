class Solution {

    public static boolean pal(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                //if case 1 is false another, case 2 is checked
                // if both are false , false is returned
                return pal(s, start + 1, end) || pal(s, start, end - 1);
            }
        }
        return true;
    }
}
