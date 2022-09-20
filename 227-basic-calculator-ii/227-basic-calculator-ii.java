class Solution {

    public int calculate(String s) {
        int sum = 0;
        int tsum = 0;
        int num = 0;
        char lastsign = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) num = num * 10 + c - '0';
            if (i == s.length() - 1 || !Character.isDigit(c) && c != ' ') {
                switch (lastsign) {
                    case '+':
                        sum += tsum;
                        tsum = num;
                        break;
                    case '-':
                        sum += tsum;
                        tsum =-num;
                        break;
                    case '*':
                        tsum *= num;
                        break;
                    case '/':
                        tsum /= num;
                        break;
                }
                lastsign = c;
                num = 0;
            }
        }
       sum += tsum;
        return sum;
    }
}
