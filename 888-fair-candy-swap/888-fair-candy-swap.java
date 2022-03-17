class Solution {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> set = new HashSet();
        int[] result= new int[2];
        int ta = 0;
        int tb = 0;
        
        for (int a : aliceSizes) {
            ta += a;
        }
        for (int b : bobSizes) {
            tb += b;
            set.add(b);
        }
        int delta = (tb - ta) / 2;
        
        for (int a : aliceSizes) {
            if(set.contains(a+delta)){
                result[0]=a;
                result[1]=a+delta;
                return result;
            }
            
        }
        return null;
    }
}
