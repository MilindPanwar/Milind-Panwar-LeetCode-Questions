class Solution {
    public boolean isPowerOfThree(int n) {
        long nn=(long)n;
        long m=nn;
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n==-1){
            return false;
        }
        int ans=p(3,m);
        if(ans==-1){
            return false;
        }else{
            return true;
        }
        
    }
    public int p(long nn, long m){
        if(nn==m){
            return 1;
        }
        if(nn>m){
            return -1;
        }
        return p(3*nn,m);
    }
}