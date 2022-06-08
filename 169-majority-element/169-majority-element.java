class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> hm= new HashMap<Integer, Integer>();
        int res=0;        
        for(int i : nums)
        {
            if(!hm.containsKey(i)){
                //adding number if not present
                hm.put(i,1);
            }else{ 
                //incrementing key value if number is present
                hm.put(i,hm.get(i)+1);
            }
            if(hm.get(i)>nums.length/2){
                //i means the number so storing the number in result
                res=i;
                break;
            }
        }
        return res;
    }
}