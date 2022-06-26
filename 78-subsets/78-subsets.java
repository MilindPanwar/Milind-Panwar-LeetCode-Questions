//ALGORITHM :
    //List of list(result naamse) banake usme empy list daldenge
    //empty list daali matlab empty set daldia result mein
    //for each loop lagake ek ek value nikaalenge given array se
        //loop chalaenge J=0 se result ki length tak
        //nayi list banaenge(temp namse) aur usme "Result" ki jth value ke sath apne array wala number chipkaate jaenge 
        //jaise {} ye tha to {1} kardenge, ye{1} tha tha to{1,2} kardenge
        //ek jth element daldia to uske baad "temp" list mein array ka element jo for each loop ki sahayata se araha hai usko daldenge. temp.add(i);
        //result mei temp daldenge
    //return karvado result ko



class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList()); //result mein empty set add kardia0

        for (int i : nums) { //array ki values ko extract karenge
            int n = res.size();
            for (int j = 0; j < n; j++) {
                List<Integer> temp = new ArrayList<>(res.get(j)); //result se uthake jth ke sath nums ka element chipka do
                temp.add(i); // nayi value lenge array se  aur temp mein daldenge
                res.add(temp); //temp ko result mein daldenge
            }
        }
        return res;
    }
}
