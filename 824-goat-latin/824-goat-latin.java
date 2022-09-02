class Solution {

    public String toGoatLatin(String sentence) {
        StringBuilder res = new StringBuilder();
        String[] words = sentence.split(" ");
        StringBuilder a = new StringBuilder();
        int i = 0;
        for (String w : words) {
            StringBuilder sb = new StringBuilder(w);
            if (
                sb.charAt(0) == 'a' ||
                sb.charAt(0) == 'e' ||
                sb.charAt(0) == 'i' ||
                sb.charAt(0) == 'o' ||
                sb.charAt(0) == 'u' ||
                sb.charAt(0) == 'A' ||
                sb.charAt(0) == 'E' ||
                sb.charAt(0) == 'I' ||
                sb.charAt(0) == 'O' ||
                sb.charAt(0) == 'U'
            ) {
                sb.append("ma");
            } else {
                char c = sb.charAt(0);
                String l = String.valueOf(c);
                StringBuilder let = new StringBuilder(l);
                sb.append(let);
                sb.append("ma");
                sb.deleteCharAt(0);
            }
            
            int length = sb.length();
            a.append("a");
            sb.append(a);
            i++;

            res.append(sb + " ");
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}
