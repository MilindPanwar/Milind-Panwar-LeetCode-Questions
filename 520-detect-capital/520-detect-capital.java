class Solution {

    public boolean detectCapitalUse(String word) {
        int c = 0;
        int s = 0;

        if (word.charAt(0) >= 65 && word.charAt(0) <= 90) {
            c = 1;
            s=1;
        }
        if (word.charAt(0) >= 97 && word.charAt(0) <= 122) {
            s = 1;
        }
        if (word.length() == 1) {
            if (c == 1 && word.charAt(0) >= 65 && word.charAt(0) <= 90) {
                return true;
            }
            if (s == 1 && word.charAt(0) >= 97 && word.charAt(0) <= 122) {
                return true;
            }
        }

        for (int i =1 ; i < word.length(); i++) {
            if (word.charAt(i) >= 65 && word.charAt(i) <= 90) {
                c++;
            } else {
                s++;
            }
        }
       
        if (c == word.length() || s == word.length()) {
            return true;
        } else return false;
    }
}
