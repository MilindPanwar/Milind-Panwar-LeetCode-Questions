class Solution {

    public int majorityElement(int[] nums) {
        //hashmap banao
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        //array ki sari value hashmap mei daldo
        for (int i = 0; i < nums.length; i++) {
            //getordefault ka matlab hai, 
            //element nahi hai to 1 rakho
            //element pehlai se present hai to uski value get karo aur +1 karke add kardo
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0, res = 0;
        //Map.entry wagehra foreach loop lagane ke liye use kia hai
        for(Map.Entry<Integer, Integer> val : map.entrySet()) {
            
            if (max < val.getValue()) { //max se badi hai frequency
                max = val.getValue(); //max mei frequency daldo
                res = val.getKey(); //result mei wo element daldo
            }
        }
        return res;
    }
}
