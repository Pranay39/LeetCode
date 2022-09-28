class Solution {
    public void sortColors(int[] nums) {
//          for(int i = 0; i < nums.length - 1; i++){
//             for(int j = i + 1; j < nums.length; j++){
//                 if(nums[j] < nums[i]){
                    
//                     swap(nums, i, j);
//                 }
//             }
//         }
//     }  
    
//     static void swap(int[]nums, int i, int j){
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
        
        int count0 = 0, count1= 0, count2 = 0; 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0)
                count0++;
            else if(nums[i] == 1)
                count1++;
            else
                count2++;
        }
        
        for(int i = 0; i < count0; i++)
            nums[i] = 0;
        for(int i = 0; i < count1; i++)
            nums[count0 + i] = 1;
        for(int i = 0; i < count2; i++)
            nums[count0 + count1 + i] = 2;
    
}
}