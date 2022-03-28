class Solution {

    public String reverseStr(String s, int k) {
        
        //convert string to array of characters
        char[] c = s.toCharArray();
        
        //increment i to 2
        for (int i = 0; i < s.length(); i += 2 * k) {
            int start = i;
            
            //condition given in question
            int end = Math.min(i + k - 1, c.length - 1);
            
            while (start < end) {
                char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }
        }
        //convert char array to string and return
        return String.valueOf(c);
    }
}
