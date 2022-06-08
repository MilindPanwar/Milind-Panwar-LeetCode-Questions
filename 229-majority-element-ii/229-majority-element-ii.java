class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> hm= new HashMap<Integer,Integer>();
        List<Integer> li = new ArrayList<>();
        if(nums.length==1)
        {
            li.add(nums[0]);
            return li;
        }
        
        for(int i : nums){
            if(!hm.containsKey(i)){
                hm.put(i,1);
            }else{
                hm.put(i, hm.get(i)+1);
            }
        }
        
        for (Integer i : hm.keySet())
        {
            if(hm.get(i)>nums.length/3)
                li.add(i);
        }
        return li;
    }
}