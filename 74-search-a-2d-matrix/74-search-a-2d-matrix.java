class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        int lo = 0;
        if(matrix.length==0){
            return false;
        }
        int hi = (n*m)-1;
        while (lo <= hi) {
            int mid = (lo + (hi-lo)/2);
            
            if (matrix[mid / m][mid % m]==target) {
                return true;
            }
            if (matrix[mid / m][mid % m]<target) {
                lo = mid + 1;
            }else{
                hi = mid - 1;
               
            }
                
            }
        
        return false;
    }
}
