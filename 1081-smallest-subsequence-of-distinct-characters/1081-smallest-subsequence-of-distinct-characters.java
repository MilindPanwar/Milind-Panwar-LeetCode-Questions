class Solution {

    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        int[] freq = new int[26];
        boolean[] b = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']--;
            if (b[s.charAt(i) - 'a']) {
                continue;
            }
            while (st.size() > 0 && st.peek() > s.charAt(i) && freq[st.peek() - 'a'] > 0) {
                char c = st.pop();
                b[c - 'a'] = false;
            }
            st.push(s.charAt(i));
            b[s.charAt(i) - 'a'] = true;
        }
        char[] ans = new char[st.size()];
        int j = ans.length - 1;
        while (j >= 0) ans[j--] = st.pop();
        return new String(ans);
    }
}
