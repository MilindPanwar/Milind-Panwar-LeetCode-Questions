class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);
        int max=0;

        for(int[] box : boxTypes){
            if(truckSize>=box[0]){
                max+=box[0]*box[1];
                truckSize-=box[0];
            }else{
                max+=truckSize*box[1];
                return max;
            }
        }
        return max;
    }
}