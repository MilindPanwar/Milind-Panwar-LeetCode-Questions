class Solution {
    public int removeDuplicates(int[] nums)
    {
        
        int count = duplicates(nums);
        return count;
    }
    public static int duplicates(int[] arr)
    {   
        int count = 1;
        int i = 0;
            for(int j = 1; j < arr.length; j++)
            {
                if(arr[i] != arr[j]) 
                {                    
                    arr[i + 1] = arr[j];
                    i++;
                    count = i + 1;
                }
            }
        
        return count;
    }
}