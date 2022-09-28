class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        result.add(l1);
        if (numRows == 1) {
            return result;
        }
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(1);
        result.add(l2);
        if (numRows == 2) {
            return result;
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> li = new ArrayList<>();
            li.add(1);
            for (int j = 1; j < i; j++) {
                li.add(result.get(i - 1).get(j-1) + result.get(i - 1).get(j));
            }
            li.add(1);
            result.add(li);
        }
        return result;
    }
}
