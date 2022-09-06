class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n==1){
            return true;
        }
        if(n==0){
            return false;
        }
        if(n%2!=0){
            return false;
        }
        long nn=(long)n;
        long m=nn;
        
        long ans=p(2, m);
        if(ans==-1){
            return false;
        }else{
            return true;
        }
    }
    public int p(long n, long m){
        if(n==m){
            return 1;
        }
        if(n>m){
            return -1;
        }
        return p(n*2, m);
    }
}