class Solution {

    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int c1 = 0;
        int c2 = s.length() - 1;
        while (c1 <= c2) {
            while (c1 < c2 && !Character.isLetter(chars[c1])) {
                c1++;
            }
            while (c1 < c2 && !Character.isLetter(chars[c2])) {
                c2--;
            }
            swap(chars, c1, c2);
            c1++;
            c2--;
        }
        return String.valueOf(chars);
    }

    public void swap(char[] chars, int c1, int c2) {
        char temp = chars[c1];
        chars[c1] = chars[c2];
        chars[c2] = temp;
    }
}
