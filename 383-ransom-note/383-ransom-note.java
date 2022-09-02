class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder r = new StringBuilder(ransomNote);
        StringBuilder m = new StringBuilder(magazine);
        int i = 0;
        while (i < r.length()) {
            if (i < r.length()) {
                char c = r.charAt(i);
                String ss = String.valueOf(c);
                if (m.indexOf(ss) != -1) {
                    m.deleteCharAt(m.indexOf(ss));
                } else {
                    return false;
                }
            }
            i++;
        }

        return true;
    }
}
