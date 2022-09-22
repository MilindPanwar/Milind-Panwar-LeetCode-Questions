class Solution {

    public int findMinDifference(List<String> timePoints) {
        int n = timePoints.size(); // timpoints ka size "n" mei store kardo
        int[] arr = new int[n]; // naya array banao "n" size ka

        for (int i = 0; i < n; i++) { // 0 se n-1 tak chalega loop
            String s = timePoints.get(i); // list ki string nikaalke "s" mei store karadi
            int val = Integer.parseInt(s.substring(0, 2))* 60 + Integer.parseInt(s.substring(3));
            arr[i] = val; //substring(0,2) matlab "hour" ko separate kiya
            //s.substring(3) matlab "minute" ko separate kiya
        }
        Arrays.sort(arr); //array ko sort karlo
        int min = (int) 1e9; // "min" mei minimum value store kara do

        for (int i = 1; i < n; i++) { //loop chalega 1 se, 0 se nahi
            //kyuki arr[i-1] ka upyog karenge hum
            min = Math.min(min, arr[i] - arr[i - 1]); //difference nikaal lenge
            //jo minimum difference hoga poore array mei se wo min mei ajaega
        }
        min = Math.min(min, 24 * 60 - arr[n - 1] + arr[0]); //circular difference check karenge
        return min; //return kardo shabhaash mere sher/sherni
    }
}
