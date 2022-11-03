class Solution {

    public int longestPalindrome(String[] words) {
        int max = 0;
        Map<String, Integer> map = new HashMap<>();

        for (String s : words) {
            String flip = "" + s.charAt(1) + s.charAt(0);

            if (map.containsKey(flip)) {
                max += 4;
                map.put(flip, map.get(flip) - 1);
                if (map.get(flip) == 0) map.remove(flip);
            } else {
                map.put(s, map.getOrDefault(s,0) + 1);
            }
        }

        for (int i = 0; i < 26; i++) {
            char c = (char) ('a' + i);
            if (map.getOrDefault(""+c+c,0) > 0) {
                max+=2;
                break;
            }
        }
        return max;
    }
}
