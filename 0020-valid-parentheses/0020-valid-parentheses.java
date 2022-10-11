class Solution {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                st.push(c);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                switch (c) {
                    case ')':
                        if (st.peek() == '(') {
                            st.pop();
                            break;
                        } else {
                            return false;
                            
                        }
                    case ']':
                        if (st.peek() == '[') {
                            st.pop();
                            break;
                        } else {
                            return false;
                          
                        }
                    case '}':
                        if (st.peek() == '{') {
                            st.pop();
                            break;
                        } else {
                            return false;
                          
                        }
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }else{
            return false; 
        }
        
    }
}
