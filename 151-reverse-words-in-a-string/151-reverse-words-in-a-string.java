class Solution {

    public String reverseWords(String s) {
        int i = 0;
        int j = 0;
        String ans = "";
        int c = 0;
        while (i < s.length() && j < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            j = i;
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }

            // sb.append(" ");
            // sb.append(s.substring(i, j))

            ans = s.substring(i, j)+" "+ans;

            i = j + 1;
        }
        StringBuilder sb = new StringBuilder(ans);
        sb.deleteCharAt(sb.length()-1);
        if(sb.charAt(0)==' '){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
