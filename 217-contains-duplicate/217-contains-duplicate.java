class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet sett = new HashSet ();
        for(int i=0; i<nums.length ;i++){
            if(sett.contains(nums[i])){
                return true;
            }else{
                sett.add(nums[i]);
            }
        }
       return false; 
    }
}