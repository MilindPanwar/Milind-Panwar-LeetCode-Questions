class Solution {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int st = 0;
        int en = arr.length - 1;

        while (en - st >= k) {
            if (Math.abs(arr[st] - x) > Math.abs(arr[en] - x)) {
                st++;
            } else {
                en--;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = st; i <= en; i++) {
            list.add(arr[i]);
        }
        return list;
    }
}
