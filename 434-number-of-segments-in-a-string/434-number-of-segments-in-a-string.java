class Solution {

    public int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int count = 0;
        int seg = 0;

        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                if (count > 0) {
                    seg++;
                    count = 0;
                }
            }
            if (i == s.length() - 1 && s.charAt(i) != ' ') {
                seg++;
            }

            i++;
        }
        return seg;
    }
}
