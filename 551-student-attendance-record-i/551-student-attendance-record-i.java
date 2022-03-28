class Solution {

    public boolean checkRecord(String s) {
        int ca = 0;
        int cl = 0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='A'){
                ca++;
            }
            if(s.charAt(i)=='L'){
                sum++;
                if(sum>max){
                    max=sum;
                }
            }else sum=0;
        }
        if(ca<2 && max <3){
            return true;
        }else return false;
    }
}
