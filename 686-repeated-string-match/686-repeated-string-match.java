class Solution {

    public int repeatedStringMatch(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int repeat = b.length() / a.length();
        for (int i = 1; i <= repeat+2; i++) {
            if (sb.append(a).toString().contains(b)) {
                return i;
            }
        }
        return -1;
    }
}
