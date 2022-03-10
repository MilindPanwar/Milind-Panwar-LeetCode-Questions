class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l.add(l1);
        if (numRows == 1) {
            return l;
        }

        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(1);
        l.add(l2);
        if (numRows == 2) {
            return l;
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> li = new ArrayList<>();
            li.add(1);
            for (int j = 1; j < i; j++) {
                li.add(j, l.get(i - 1).get(j - 1) + l.get(i - 1).get(j));
            }
            li.add(1);
            l.add(li);
        }
        return l;
    }
}
