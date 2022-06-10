class Solution {
​
public List<List<Integer>> fourSum(int[] nums, int target) {
Arrays.sort(nums);
Set<List<Integer>> set = new HashSet<List<Integer>>();
​
for (int i = 0; i < nums.length; i++) {
for (int j = i + 1; j < nums.length; j++) {
for (int k = j + 1; k < nums.length; k++) {
int xx = target - (nums[i] + nums[j] + nums[k]);
boolean ckr = bs(nums, k + 1, nums.length - 1, xx);
if (ckr == true) {
set.add(Arrays.asList(nums[i], nums[j], nums[k], xx));
}
}
}
}
List<List<Integer>> list = new ArrayList<>(set);
​
return list;
}
​
boolean bs(int[] num, int lo, int hi, int x) {
while (lo < hi) {
int mid = (lo + hi) / 2;
if (num[mid] > x) {
hi = mid;
} else if (num[mid] < x) {
lo = mid + 1;
} else if (num[mid] == x) {
return true;
}
}
return false;
}
}
​