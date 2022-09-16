class Solution {

    public String alphabetBoardPath(String s) {
        int previ = 0;
        int prevj = 0;
        char[] c = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            int curi = (c[i] - 'a') / 5;
            int curj = (c[i] - 'a') % 5;
            if (curi == previ && curj == prevj) {
                sb.append("!");
            } else {
                pp(sb, previ, prevj, curi, curj);
                sb.append("!");
            }
            previ=curi;
            prevj=curj;
        }
        return sb.toString();
    }

    public static StringBuilder pp(StringBuilder sb, int pi, int pj, int ci, int cj) {
        while (ci < pi) {
            sb.append("U");
            ci++;
        }
         while (cj > pj) {
            sb.append("R");
            cj--;
        }
         while (cj < pj) {
            sb.append("L");
            cj++;
        }
        while (ci > pi) {
            sb.append("D");
            ci--;
        }
       
       
        return sb;
    }
}
