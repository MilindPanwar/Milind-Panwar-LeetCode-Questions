class Solution {

    public static boolean pal(String s, int start, int end) {
        //recursion
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                //if it is still not equal return false
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
                //above pal 1st one is true then it is chosen otherwise 2nd one is chosen
            }
        }
        return true;
    }
}
