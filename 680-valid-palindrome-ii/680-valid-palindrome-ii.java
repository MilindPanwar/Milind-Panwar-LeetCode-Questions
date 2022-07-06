/*              ALGORITHM
    1. compare each element from i=0 & j=s.length()-1
    2. separate function to check if there are any extra element rather than 1
    3. funtion runs from i+1 or j-1
    4. function returns false if there are more than 1 element 
*/


class Solution {

    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return isPal(s, i + 1, j) || isPal(s, i, j - 1);
            }
        }
        return true;
    }

    public boolean isPal(String s, int i, int j) {
        //funtion returns true only if there is only one extra element which is stopping palindrome
        //if it returns false that means there are more than one elements 
        //if more than 1 element is present that means it cannot become a palindrome
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}
