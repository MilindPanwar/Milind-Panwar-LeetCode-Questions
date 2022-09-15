class Solution {

    public String customSortString(String order, String s) {
        HashMap<Character, Integer> hm = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < order.length(); i++) {
            if (hm.containsKey(order.charAt(i))) {
                int it = hm.get(order.charAt(i));
                if (it > 1) {
                    while (it > 0) {
                        sb.append(order.charAt(i));
                        it--;
                    }
                } else {
                    sb.append(order.charAt(i));
                }
            }
        }

        HashSet<Character> hs= new HashSet();
        for (int i = 0; i < order.length(); i++) {
            hs.add(order.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (!hs.contains(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
