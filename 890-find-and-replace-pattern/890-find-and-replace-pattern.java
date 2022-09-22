class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] p = f(pattern);//function banaya hai "f" naamka
        //pehlai "f" function dekho, jao.
        ArrayList<String> list= new ArrayList<>();
        for(String w : words){
            
            if(Arrays.equals(f(w),p)){
                list.add(w);
            }
        }
        return list;
    }
    public static int[] f(String p){
        int n=p.length(); //length ko "n" mei store karva lia
        int[] res= new int[n]; //isme answer dalke return karvaenge
        HashMap<Character, Integer> m= new HashMap<>(); //hashmap taki kaam jaldi ho
        for(int i=0;i<n;i++){
            m.putIfAbsent(p.charAt(i),m.size()); //agar hashmap mei nahi hai "p" ka curr char to hashmap mei wo curr char dalo aur hashmap ka size dalo
             res[i]=m.get(p.charAt(i));//array mei store karado 
        }
        return res;
        
    }
}