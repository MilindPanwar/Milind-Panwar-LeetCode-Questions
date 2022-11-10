class Solution {

    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (map.get(c) > 1) {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }
}
