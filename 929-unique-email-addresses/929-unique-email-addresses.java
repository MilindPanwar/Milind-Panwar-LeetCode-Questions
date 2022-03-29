class Solution {
    public int numUniqueEmails(String[] emails) {
        //set for storing valid emails
        Set<String> set= new HashSet<>();
        for(String email:emails){
            //split in 0 and 1 from @ 
            //0 = local part
            //1 = domain part;
            String[] parts= email.split("@");
            //0= part before +, rest is ignored
            String[] local= parts[0].split("\\+");
            //removing dot and adding @ and domain
            set.add(local[0].replace(".","")+"@"+parts[1]);
        }
        //returning how many are present in hashset
        return set.size();
        
    }
}
