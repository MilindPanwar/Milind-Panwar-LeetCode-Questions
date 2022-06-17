class Solution {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> set =new HashSet<>();
        for(int i :nums){
            if(set.contains(i)){
                return true;
            }else{
                set.add(i);
            }
        }
        return false;
    }
}
