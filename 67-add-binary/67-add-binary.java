class Solution {

    public String addBinary(String a, String b) {
        int l1=a.length();
        int l2=b.length();
        int i=0;
        int carry=0;
        int x=0;
        int y=0;
        String result="";
        while(i<l1 || i< l2 || carry!=0){
            x=0;
            if(i<l1 && a.charAt(a.length()-1-i)=='1'){
                x=1;
            }
            
            y=0;
            if(i<l2 && b.charAt(b.length()-1-i)=='1'){
                y=1;
            }
            i++;
            
            result=(x+y+carry)%2 + result;
            carry=(x+y+carry)/2;
        }
        return result;
    }
}
