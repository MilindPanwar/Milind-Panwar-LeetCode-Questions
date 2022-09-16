class Solution {

    public List<String> wordSubsets(String[] words1, String[] words2) {
        
        List<String> res = new ArrayList<>();
        
        //target mein words2 ke har alphabet ki frequency badaenge
        int[] target = new int[26];
        
        for (String b : words2) {
            int[] tmp = new int[26];
            for (char c : b.toCharArray()) {
                tmp[c - 'a']++; //agar "Z" hai to "Z" pe ++ hoga
                
                //target mein max frqncy store karni hai islie
                target[c - 'a'] = Math.max(tmp[c - 'a'], target[c - 'a']);
            }
        }
        
        
        for (String a : words1) {
            //words1 ki string ke alphabets ki frqncy badaenge
            int[] src = new int[26];
            for (char c : a.toCharArray()) {
                src[c - 'a']++;
            }
            
            //ye if condition mein main kaam horaha hai
            //ye subset function, word1 ke alphbt ki frqncy
            //aur words2 ke alfbts ki frqncy compare karega
            //agar dono ki frequency equal nahi hui to return false 
            //yaami "res.add(a)" nahi chalpaega
            if (subset(src, target)) { 
                res.add(a);
            }
        }
        return res;
    }

    public static boolean subset(int[] parents, int[] child) {
        for (int i = 0; i < 26; i++) {
            if (parents[i] < child[i]) { 
                return false; //agar frqncy same nahi hai to
            }
        }
        return true;
    }
}
