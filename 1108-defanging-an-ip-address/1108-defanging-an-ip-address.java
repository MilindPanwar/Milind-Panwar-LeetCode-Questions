class Solution {
    public String defangIPaddr(String a) {
        StringBuilder n=new StringBuilder();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='.'){
                n.append("[.]");
            }else{
                n.append(a.charAt(i));
            }
        }
        return n.toString();
    }
}