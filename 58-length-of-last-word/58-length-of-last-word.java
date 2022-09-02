class Solution {

    public int lengthOfLastWord(String s) {
        int p = s.length() - 1;
        int c=0;
        while (p>=0 && s.charAt(p) == ' ') {
            p--;
        }
        while(p>=0 && s.charAt(p)!=' '){
            c++;
            p--;
        }
        return c;
    }
}
