class Solution {

    public int[] twoSum(int[] nums, int target) {
        if(nums==null){
            return null;
        }
        int[] nid = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            nid[j] = nums[j];
        }
        int st = 0;
        Arrays.sort(nums);
        int en = nums.length - 1;
        int[] arr = new int[2];
        int num1 = 0;
        int num2 = 0;
        while (st < en) {
            if (nums[st] + nums[en] == target) {
                num1 = nums[st];
                num2 = nums[en];
                break;
            } else if (nums[st] + nums[en] > target) {
                en--;
            } else {
                st++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (num1 == nid[i]) {
                arr[0] = i;
                break;
            }
        }
        if (num1 !=num2) {
            for (int i = 0; i < nums.length; i++) {
                if (num2 == nid[i]) {
                    arr[1] = i;
                    break;
                }
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (num2 == nid[i] && i != arr[0]) {
                    arr[1] = i;
                    break;
                }
            }
        }
        return arr;
    }
}
