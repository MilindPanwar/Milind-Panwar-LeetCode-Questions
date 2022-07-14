class Solution {
    public int compress(char[] chars) {
        if(chars.length==1){
            return 1;
        }
        int i=0;
        int c=1;
        String s="";
        while(i<chars.length){
            
            if(i!=chars.length-1 && chars[i]==chars[i+1]){
                c++;
            }else{
                if(c>1){
                s=s+chars[i]+c;    
                }else if(c==1){
                    s=s+chars[i];
                }
                
                c=1;
            }
            
            i++;
        }

        for(int j=0;j<s.length();j++){
            chars[j]=s.charAt(j);
        }
        return s.length();
    }
}