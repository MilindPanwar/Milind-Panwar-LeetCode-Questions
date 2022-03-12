class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
//creating new array
        int[] arr =new int[nums.length+1];
//tranfering values of nums to arr
//only adding in index value 1 in index 1 , value 2 in index 2 and so on
//only adding values in particular indexes
//some index remains 0
        for(int n: nums){
            arr[n]=n;
        }
        List<Integer> l= new ArrayList<>();
//if zero is found, adding that index to list.
        for(int i=1; i<arr.length;i++){
            if(arr[i]==0){
                l.add(i);
            }
        }
        return l;

    }
}