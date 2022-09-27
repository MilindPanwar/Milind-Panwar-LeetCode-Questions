class Solution {
    public double average(int[] salary) {
        int min=salary.length-1;
        for(int i=0;i<salary.length;i++){
            if(salary[i]<salary[min]){
                min=i;
            }
        }   
        int max=0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]>salary[max]){
                max=i;
            }
        }  
        
        double sum=0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]!=salary[min] && salary[i]!=salary[max]){
                sum+=salary[i];            
            }
        }
        double d=salary.length-2;
        return sum/d; 
    }
}