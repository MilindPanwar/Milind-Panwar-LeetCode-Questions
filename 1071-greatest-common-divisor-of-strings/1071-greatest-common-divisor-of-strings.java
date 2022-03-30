class Solution {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
            
            //if both are same return any of them
        } else if (str1.equals(str2)) {
            return str1;
            
            // if str1 is greater than remove str2 from str1
        } else if (str1.length() > str2.length()) {
            return gcdOfStrings(str1.substring(str2.length()), str2);
            
            //if str2 is greater than remove str1 from str2
        } else {
            return gcdOfStrings(str2.substring(str1.length()), str1);
        }
    }
}
