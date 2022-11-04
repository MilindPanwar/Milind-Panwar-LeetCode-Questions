class Solution {

    public String reverseVowels(String s) {
        String vow = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (
                s.charAt(i) == 'a' ||
                s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' ||
                s.charAt(i) == 'o' ||
                s.charAt(i) == 'u' ||
                s.charAt(i) == 'A' ||
                s.charAt(i) == 'E' ||
                s.charAt(i) == 'I' ||
                s.charAt(i) == 'O' ||
                s.charAt(i) == 'U'
            ) {
                vow = vow + s.charAt(i);
            }
        }

        int i = 0;
        int p2 = 0;
        String ans = "";
        while (p2 < vow.length()) {
            if (
                s.charAt(i) == 'a' ||
                s.charAt(i) == 'e' ||
                s.charAt(i) == 'i' ||
                s.charAt(i) == 'o' ||
                s.charAt(i) == 'u' ||
                s.charAt(i) == 'A' ||
                s.charAt(i) == 'E' ||
                s.charAt(i) == 'I' ||
                s.charAt(i) == 'O' ||
                s.charAt(i) == 'U'
            ) {
                ans = ans + vow.charAt(p2);
                p2++;
                i++;
            } else {
                ans = ans + s.charAt(i);
                i++;
            }
        }
        if (i < s.length()) {
            while (i <s.length()) {
                ans = ans + s.charAt(i);
                i++;
            }
        }
        return ans;
    }
}
