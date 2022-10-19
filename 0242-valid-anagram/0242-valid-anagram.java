class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashSet<Character> set= new HashSet<>();
        char[] c= new char[26];
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            c[sc-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char sc=t.charAt(i);
            if(c[sc-'a']>0){
                c[sc-'a']--;
            }else{
                return false;
            }
        }
        return true;
    }
}