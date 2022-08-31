class Solution {
    public boolean checkRecord(String s) {
        int absent=0;
        int late=0;
       
        int al=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                absent++;
            }
            if(s.charAt(i)=='L'){
                al++;
                if(al>=3){
                    late++;
                }
            }else{
                al=0;
            }
        }
        if(absent>=2 || late>0){
            return false;
        }else{
            return true;
        }
        
    }
}