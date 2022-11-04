class Solution {

    public String reverseVowels(String s) {
        StringBuilder vow = new StringBuilder();
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
                vow.append(s.charAt(i));
            }
        }

        int i = 0;
        int p2 = 0;
        StringBuilder ans = new StringBuilder();
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
                ans.append(vow.charAt(p2));
                p2++;
                i++;
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }
        if (i < s.length()) {
            while (i < s.length()) {
                ans.append(s.charAt(i));
                i++;
            }
        }
        return ans.toString();
    }
}
