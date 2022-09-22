class Solution {
    public String reverseWords(String s) {
        int i=0;
        int j=0;
        
        StringBuilder sb= new StringBuilder();
        while(i<s.length()){
            while(j<s.length() && s.charAt(j)!=' '){
                j++;
            }
            String a= s.substring(i,j);
            a=" "+a;
            StringBuilder n= new StringBuilder(a);
            
            sb.append(n.reverse());
            i=j+1;
            j++;
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
}