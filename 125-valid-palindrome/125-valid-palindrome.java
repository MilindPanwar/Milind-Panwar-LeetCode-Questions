class Solution {

    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int head = 0;
        int tail = s.length() - 1;
        char chead, ctail;
        while (head <= tail) {
             chead = s.charAt(head);
             ctail = s.charAt(tail);
            //if head element is space, sign, etc
            if (!Character.isLetterOrDigit(chead)) {
                head++;
                
            }
            //if tail element is space, sign, etc
            else if (!Character.isLetterOrDigit(ctail)) {
                tail--;
            } 
            //if element is not space, sign etc
            else {
                //checking the start and end
                //if start element ie head is not equal to end element
                //returning false
                if (Character.toLowerCase(chead) != Character.toLowerCase(ctail)) {
                    return false;
                }
                head++;
                tail--;
            }
        }
        //this means tail became equal to head
        //traversed through the string
        //and no mismatch between head char and tail char found
        return true;
    }
}
