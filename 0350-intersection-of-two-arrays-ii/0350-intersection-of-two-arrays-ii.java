class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> result = new ArrayList<Integer>();

        //nums1 ki values HashMap mein values daal do
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }

        //nums2 mein iterate karo aur intersecting values ko alag karo
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                result.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int[] answer = new int[result.size()];
        int k=0;
        for(int i :result){
            answer[k]=i;
            k++;
        }
        return answer;
    }
}
