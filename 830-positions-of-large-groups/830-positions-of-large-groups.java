class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result = new ArrayList<>();
        
        int i=0;
        int j=0;
        int len= s.length();
        while(i<len){
            char ch = s.charAt(i);
            j=i;
            while(j<len && ch==s.charAt(j)){
                j++;
            }
            if(j-i>=3){
                List<Integer> list= new ArrayList<>();
                list.add(i);
                list.add(j-1);
                result.add(list);
            }
            i=j;
        }
        return result;
        
    }
}