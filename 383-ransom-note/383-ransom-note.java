class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        StringBuilder ran = new StringBuilder(ransomNote);
        StringBuilder mag = new StringBuilder(magazine);
        int i = 0;
        while (i < ran.length()) {
            char ch = ran.charAt(i);
            String ctos= String.valueOf(ch);
            int ind = mag.indexOf(ctos);
            if (ind != -1) {
                mag.deleteCharAt(ind);
            } else {
                return false;
            }
            i++;
        }
        return true;
    }
}
