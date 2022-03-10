03/07/2022 09:57  Accepted  1 ms  42.1 MB java
​
class Solution {
​
public List<List<Integer>> generate(int numRows) {
//create dynamic linked list
List<List<Integer>> res = new ArrayList<>();
//create null list for row and previous row
List<Integer> row, preRow = null;
​
for (int i = 0; i < numRows; i++) {
//initialising the row
row = new ArrayList<Integer>();
​
for (int j = 0; j <= i; j++) {
if (j == 0 || j == i) {
row.add(1);
//adding element of j-1 and j of previous row in current row
} else row.add(preRow.get(j - 1) + preRow.get(j));
}
//updating previous row
preRow = row;
//storing answer in result
res.add(row);
}
return res;
}
}
​