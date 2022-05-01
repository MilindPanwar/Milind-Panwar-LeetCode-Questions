class Solution {

    public List<List<Integer>> generate(int numRows) {
        //list of list of integers
        List<List<Integer>> l = new ArrayList<>();
        
        //l1 for first row consisting on only 1
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l.add(l1);
        if (numRows == 1) {
            return l;
        }
        //l2 for second row consisting only 2
        List<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(1);
        l.add(l2);
        if (numRows == 2) {
            return l;
        }
        
        //starting i from 2, as 1 and 2 row are done
        for (int i = 2; i < numRows; i++) {
            
            List<Integer> li = new ArrayList<>();
            li.add(1);
            for (int j = 1; j < i; j++) {
                //get i-1 . get j-1 means, get previous row previous col element
                //get i-1 .get j means, get previous row current col element
                li.add(j, l.get(i - 1).get(j - 1) + l.get(i - 1).get(j));
            }
            li.add(1);
            l.add(li);
        }
        return l;
    }
}
