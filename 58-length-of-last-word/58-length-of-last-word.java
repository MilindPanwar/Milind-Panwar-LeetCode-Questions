class Solution {

    public int lengthOfLastWord(String s) {
        int length = 0;
        //reverse loop
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                //if element at index is not space
                length++;
            }
            //entering here means we found a space
            //that can be a first space
            //or may be a space after a whole word
            else {
                if (length > 0) {
                    //if we already incremented length before
                    //means we already traversed a whole word
                    //and now we got a space
                    //so return the length
                    return length;
                }
            }
        }
        return length;
    }
}
