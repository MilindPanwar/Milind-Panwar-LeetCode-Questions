class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0; //count karenge kahan ki kahan pushp place karsakte hain
        
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){ //agar current element 0 hai
                int prev= (i==0 || flowerbed[i-1]==0) ? 0 : 1;  // normal if statement
                int next= (i==flowerbed.length-1 || flowerbed[i+1]==0) ? 0 : 1 ; // statement       
                if(prev==0 && next==0){ //dono 0 hain to pushp place kardo
                    flowerbed[i]=1;
                    count++; //count bada do
                }
            }
            
        }
        return count>=n; //count agar equal ya greater hai to true return kardo
        
    }
}