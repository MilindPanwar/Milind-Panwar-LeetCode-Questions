class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> hs= new HashSet<>();
        for(String i : words){
            String temp="";
            for(int j=0;j<i.length();j++){
                int num= i.charAt(j);
                temp=temp+arr[num%97];
            }
            if(!hs.contains(temp)){
                hs.add(temp);
            }
        }
        return hs.size();
    }
}