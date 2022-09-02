class Solution {

    public boolean isPalindrome(String s) {
       String b= s.toLowerCase();
        StringBuilder sb = new StringBuilder(b);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(sb.charAt(i))) {
                String ch = String.valueOf(sb.charAt(i));
                res.append(ch);
            }
        }
        int p1 = 0;
        int p2 = res.length() - 1;
        while (p1 <= p2) {
            if (res.charAt(p1) == res.charAt(p2)) {
                p1++;
                p2--;
            } else {
                return false;
            }
        }
        return true;
    }
}
