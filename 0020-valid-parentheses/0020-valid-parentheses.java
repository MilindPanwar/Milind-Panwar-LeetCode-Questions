class Solution {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                switch (c) {
                    case '}':
                        if (!st.isEmpty() && st.peek() == '{') st.pop(); else return false;

                        break;
                    case ')':
                        if (!st.isEmpty() && st.peek() == '(') st.pop(); else return false;
                        break;
                    case ']':
                        if (!st.isEmpty() && st.peek() == '[') st.pop(); else return false;
                        break;
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}
