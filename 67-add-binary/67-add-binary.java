class Solution {

    public String addBinary(String a, String b) {
        int i = 0;
        int carry = 0;
        String result = "";
        int al = a.length();
        int bl = b.length();
        while (i < al || i < bl || carry != 0) {
            int x = 0;
            if (i < al && a.charAt(al - 1 - i) == '1') {
                x = 1;
            }
            int y = 0;
            if (i < bl && b.charAt(bl - 1 - i) == '1') {
                y = 1;
            }
            result = (x + y + carry) % 2 + result;
            carry = (x + y + carry) / 2;
            i++;
        }
        return result;
    }
}
