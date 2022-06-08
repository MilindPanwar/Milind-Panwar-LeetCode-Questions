class Solution {

    public List<Integer> majorityElement(int[] nums) {
        int num1 = -1;
        int num2 = -1;
        int c1 = 0;
        int c2 = 0;

        for (int i : nums) {
            if (num1 == i) {
                c1++;
            } else if (num2 == i) {
                c2++;
            } else if (c1 == 0) {
                num1 = i;
                c1 = 1;
            } else if (c2 == 0) {
                num2 = i;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        int co1 = 0;
        int co2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num1 == nums[i]) {
                co1++;
            } else if (num2 == nums[i]) {
                co2++;
            }
        }
        List<Integer> li = new ArrayList<>();
        if (co1 > nums.length / 3) {
            li.add(num1);
        }
        if (co2 > nums.length / 3) {
            li.add(num2);
        }
        return li;
    }
}
