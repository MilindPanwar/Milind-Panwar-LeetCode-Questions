class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        String lc=s.toLowerCase();
        StringBuilder sb= new StringBuilder();
        int sl=s.length();
        for(int i=0;i<lc.length();i++){
            char c=lc.charAt(i);
            if(c>='a' && c<='z' || c>=48 && c<=57){
                sb.append(c);
            }
        }   
      
        int st=0;
        int e=sb.length()-1;
        while(st<=e){
            if(sb.charAt(st)==sb.charAt(e)){
                st++;
                e--;
            }else{
                return false;
            }
        }
        return true;
    }
}