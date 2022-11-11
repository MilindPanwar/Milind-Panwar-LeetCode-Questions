class Solution {

    public boolean isPalindrome(String S) {
        String s = S.toLowerCase();
        int i = 0, j = s.length() - 1;

        while (i <= j) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(j);
            while (i <= j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i <= j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (i <= j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
