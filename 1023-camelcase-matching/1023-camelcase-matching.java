class Solution {

    public List<Boolean> camelMatch(String[] queries, String p) {
        List<Boolean> b = new ArrayList<>();
       
        for (String s : queries) {
            int i = 0;
            int j = 0;
            while (i < p.length() && j < s.length()) {
                if ( s.charAt(j) == p.charAt(i)) {
                    i++;
                    j++;
                } else if (Character.isUpperCase(s.charAt(j))) {
                    break;
                } else {
                    j++;
                }
            }
            if (i < p.length()) {
                b.add(false);
                continue;
            }
            while (j < s.length()) {
                if (Character.isUpperCase(s.charAt(j))) {
                    b.add(false);
                    break;
                }
                j++;
            }
            if (j == s.length()) {
                b.add(true);
            }
        }
        return b;
    }
}
