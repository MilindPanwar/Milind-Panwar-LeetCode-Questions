class Solution {

    public int repeatedStringMatch(String a, String b) {
        //creating new string 'sa' to add in 'a' later on
        String sa = a;
        //dividing 'b' by 'a', which gives the number of times 'a' would be present in 'b'
        //repeat= number of repeatitions of a in b
        int repeat = b.length() / a.length();
        int count = 1;
        // repeat+2 because 2 more substri is possible at the start and at the end
        for (int i = 0; i < repeat + 2; i++) {
            if (a.contains(b)) {
                return count;
            } else {
                //adding a in a and again
                a += sa;
                count++;
            }
        }
        //if no substri is there
        return -1;
    }
}
