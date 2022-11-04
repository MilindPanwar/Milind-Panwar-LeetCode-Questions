class Solution {
    public String reverseVowels(String s) {
        char[] c=s.toCharArray();
        int p1=0;
        int p2=c.length-1;
        while(p1<p2){
            
            while(p1<p2 && !vow(c[p1])){
                p1++;
            }
            while(p1<p2 && !vow(c[p2])){
                p2--;
            }
            char t= c[p1];
            c[p1]=c[p2];
            c[p2]=t;
            p1+=1;
            p2-=1;
        }
        String str= new String(c);
        return str;
    }
     public boolean vow(char c){
        c= Character.toLowerCase(c);
        return c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u';
    }
}