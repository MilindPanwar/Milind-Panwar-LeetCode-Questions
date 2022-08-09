class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result= new HashSet<>();
        if(nums==null || nums.length<3){
            return new ArrayList<>();
        }
        
        for(int i=0;i<nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            if(l==nums.length) break;
            
            while(l<r){
                int sum = nums[i]+nums[r]+nums[l];
                if(sum==0){
                    List<Integer> list =new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[r]);
                    list.add(nums[l]);
                    result.add(list);
                    l++;
                    r--;
                }else if(sum<0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}