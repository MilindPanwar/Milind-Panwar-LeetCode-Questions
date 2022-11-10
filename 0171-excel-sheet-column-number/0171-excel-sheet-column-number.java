class Solution {

    public int titleToNumber(String ct) {
        int sum=0;
        for (int i = 0; i < ct.length(); i++) {
            sum *= 26;
            sum += ct.charAt(i) - 'A'+1;
        }
        return sum;
    }
}
