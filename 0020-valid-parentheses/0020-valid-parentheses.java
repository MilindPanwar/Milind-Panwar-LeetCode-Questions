class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty() || c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                switch (c) {
                    case ')':
                        if (stack.peek() == '(') {
                            stack.pop();
                            break;
                        } else {
                            return false;
                        }
                    case '}':
                        if (stack.peek() == '{') {
                            stack.pop();
                            break;
                        } else {
                            return false;
                        }
                    case ']':
                        if (stack.peek() == '[') {
                            stack.pop();
                            break;
                        } else {
                            return false;
                        }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
}
