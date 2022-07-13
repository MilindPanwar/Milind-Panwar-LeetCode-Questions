class Solution {

    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        int len = words[words.length - 1].length();
        return len;
    }
}
