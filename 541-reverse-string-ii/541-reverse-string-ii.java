                /*ALGORITHM
    1. make copy of string in stringbuilder
    2. while loop for incrementing k
    3. inner while loop for swapping the elements
    
*/

class Solution {

    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);

        int l = 0;
        while (l < sb.length()) {
            int i = l;
            
            //the most important step is to initialize "j" everytime
            int j = Math.min(l+k, sb.length())-1;
            //l+k works if elements equal to k or greater than k is left
            //sb.length works if like elements left is 2 and k is 3
            while (i < j) {
                StringBuilder t = new StringBuilder(sb);
                sb.setCharAt(i, t.charAt(j));
                sb.setCharAt(j, t.charAt(i));
                i++;
                j--;
            }
            l = l + (2 * k);
        }
        return sb.toString();
    }
}
