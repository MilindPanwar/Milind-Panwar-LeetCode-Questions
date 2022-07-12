class Solution {

    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set = new HashSet<>();
        for (String bword : banned) {
            set.add(bword);
        }

        HashMap<String, Integer> hmp = new HashMap<>();
        for (String word : paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")) {
            if (!set.contains(word)) {
                hmp.put(word, hmp.getOrDefault(word, 0) + 1);
            }
        }
        String result = "";
        for (String k : hmp.keySet()) {
            if (result.equals("") || hmp.get(k) > hmp.get(result)) {
                result = k;
            }
        }
        return result;
    }
}
