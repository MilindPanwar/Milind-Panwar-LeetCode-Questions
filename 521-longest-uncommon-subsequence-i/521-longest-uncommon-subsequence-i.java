/* 
                ALGORITHM
1.  longest uncommon subsequence means if the whole string is different
    then it is called longest uncommon subsequnce
2.  just compare both string and if equal return -1 else return Math.max height of a or b
*/

class Solution {

    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
