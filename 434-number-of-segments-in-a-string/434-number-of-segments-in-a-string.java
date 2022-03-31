class Solution {

    public int countSegments(String s) {
        int segment = 0;
        char[] charr = s.toCharArray();
        for (int i = 0; i < charr.length; i++) {
            if (charr[i] != ' ') {
                segment++;
            }
            //count one word 
            while (i < charr.length && charr[i] != ' ') {
                //if one word is completed
                //assign value of i to the end of the word
                //word by word segment is counted
                i++;
            }
        }
        return segment;
    }
}
