class Solution {

    public String toGoatLatin(String sentence) {
        int c = 1;
        StringBuilder res = new StringBuilder();
        String[] words = sentence.split("\\W+");

        for (String i : words) {
            StringBuilder sb = new StringBuilder(i);

            if (i.startsWith("a") || i.startsWith("e") || i.startsWith("i") || i.startsWith("o") || i.startsWith("u") || i.startsWith("A") || i.startsWith("E") || i.startsWith("I") || i.startsWith("O") || i.startsWith("U")) {
                sb.append("ma");
                int k = 0;
                while (k < c) {
                    sb.append("a");
                    k++;
                }
            } else {
                char ch = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(ch);

                sb.append("ma");
                int k = 0;
                while (k < c) {
                    sb.append("a");
                    k++;
                }
            }
            res.append(sb + " ");
            c++;
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }      
}
