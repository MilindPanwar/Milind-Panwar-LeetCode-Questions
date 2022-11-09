class Solution {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int c = i + 1;
            if (c % 3 == 0 && c % 5 == 0) {
                list.add("FizzBuzz");
            } else if (c % 3 == 0) {
                list.add("Fizz");
            } else if (c % 5 == 0) {
                list.add("Buzz");
            } else {
                String s = Integer.toString(c);
                list.add(s);
            }
        }
        return list;
    }
}
