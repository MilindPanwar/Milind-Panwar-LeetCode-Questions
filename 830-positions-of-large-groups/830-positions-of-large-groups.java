class Solution {

    public List<List<Integer>> largeGroupPositions(String s) {
        //list of list banao jo return karni hogi
        List<List<Integer>> list = new ArrayList<>();

        //ye starting index hai
        int i = 0;
        int len = s.length();

        while (i < len) { //jab "i" , "len" ke equal ya bada hojae to break
            char c = s.charAt(i); // "i"th character "c" mei daldo
            int j = i; //ye "j" char ko count karega
            while (j < len && c == s.charAt(j)) { //jabtak j milraha hai...
                j++; //...tabtak j mei plus 1 karte jao
            }
            if (j - i >= 3) { //uss char ki length
                // j-i karna pada taaki length nikal paaye
                List<Integer> l1 = new ArrayList<>(); //nayi list banap
                l1.add(i); // i add kardo (start index)
                l1.add(j - 1); // (j-i) add kardo( end index)
                list.add(l1); //dynamic arraylist mein daldo
            }
            i = j; //i ab waha se chalega jaha naya char hai
        }
        return list;
    }
}
