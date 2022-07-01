class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        comsum(candidates, 0, target, new ArrayList<>(), res);
        return res;
    }

    public void comsum(int[] arr, int ind, int target, List<Integer> li, List<List<Integer>> res) {
        if (ind == arr.length) {
            if (target == 0) {
                res.add(new ArrayList<>(li));
            }
            return;
        }
        //pick
        if (arr[ind] <= target) {
            li.add(arr[ind]);
            comsum(arr, ind, target - arr[ind], li, res);
            li.remove(li.size() - 1);
        }
        //not pick
        comsum(arr, ind + 1, target, li, res);
    }
}
