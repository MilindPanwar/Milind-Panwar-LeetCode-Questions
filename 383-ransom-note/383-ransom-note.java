class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        //char array for every alphabet
        //separate space for every alphabet
        int[] charr = new int[26];

        for (int c : magazine.toCharArray()) {
            //alphabet from magazine stored in c
            //increment the value of that particular element in char array
            //index of that element is searched and incremented in char array
            charr[c - 'a'] += 1;
        }
        for (int c : ransomNote.toCharArray()) {
            //if char array have zero value for a particular alphabet
            //at its destined index
            //then return false
            if (charr[c - 'a'] == 0) {
                return false;
            }
            //if char array have some value at index of given character
            //subtract that value
            charr[c - 'a'] -= 1;
        }
        return true;
    }
}
